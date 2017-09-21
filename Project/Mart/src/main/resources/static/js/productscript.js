/**
 * Created by Chamith on 13/09/2017.
 */

$( function() {
    $( "#datepicker" ).datepicker();
} );

$('.button-collapse').sideNav({
        menuWidth: 300, // Default is 300
        edge: 'right', // Choose the horizontal origin
        closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
        draggable: true // Choose whether you can drag to open on touch screens
    }
);
simpleCart({
    // array representing the format and columns of the cart,
    // see the cart columns documentation
    cartColumns: [
        {attr: "name", label: "Name"},
        {attr: "id", label: "ID"},
        {attr: "numb", label: "Number"},

        {view: "currency", attr: "price", label: "Price"},
        {view: "decrement", label: false},
        {attr: "quantity", label: "Qty"},
        {view: "increment", label: false},
        {view: "currency", attr: "total", label: "SubTotal"},
        {view: "remove", text: "Remove", label: false}
    ],

    // "div" or "table" - builds the cart as a
    // table or collection of divs
    cartStyle: "div",


    // how simpleCart should checkout, see the
    // checkout reference for more info
    checkout: {
        type: "SendForm",
        method: "GET",
        url: "http://localhost:8081/order/add",
        extra_data: {
            totals: simpleCart.total()
        }



    },

    // set the currency, see the currency
    // reference for more info
    currency: "USD",

    // collection of arbitrary data you may want to store
    // with the cart, such as customer info
    data: {},


    // set the cart langauge
    // (may be used for checkout)
    language: "english-us",

    // array of item fields that will not be
    // sent to checkout
    excludeFromCheckout: [],

    // custom function to add shipping cost
    shippingCustom: null,

    // flat rate shipping option
    shippingFlatRate: 0,

    // added shipping based on this value
    // multiplied by the cart quantity
    shippingQuantityRate: 0,

    // added shipping based on this value
    // multiplied by the cart subtotal
    shippingTotalRate: 0,

    // tax rate applied to cart subtotal
    taxRate: 0,

    // true if tax should be applied to shipping
    taxShipping: false,

    // event callbacks
    beforeAdd: null,
    afterAdd: null,
    load: null,
    beforeSave: null,
    afterSave: null,
    update: null,
    ready: null,
    checkoutSuccess: null,
    checkoutFail: null,
    beforeCheckout: null,
    beforeRemove: null
});

// simpleCart.bind( 'beforeAdd' , function( item ){
//
// alert( item.get("num"));
//
// });


simpleCart.bind("afterAdd", function (item) {

    Materialize.toast(item.get("name") + " was added to the cart!", 4000);

    loaditemtocart();
});
function loaditemtocart() {
    $('.collection-item').remove();
    var loaditem = document.getElementById("totalvalue");
    if(loaditem!=null){
        loaditem.value = simpleCart.grandTotal().toFixed(2);
       // alert(simpleCart.grandTotal().toFixed(2));
        simpleCart.empty();
    }
    var badge = document.getElementById('smallcartbadge');
    badge.innerHTML = simpleCart.quantity();
    var grandtotalele = document.getElementById('grandtotal');
    grandtotalele.innerHTML = 'Grand Total : Rs .' + simpleCart.grandTotal().toFixed(2);



    simpleCart.each(function (item) {


        var ulElement = document.getElementById('smallcart');
        var liElement = document.createElement('li');

        liElement.setAttribute('class', 'collection-item avatar');
        var spanelement = document.createElement('span');
        spanelement.setAttribute('class', 'title');
        spanelement.innerHTML = item.get('name');
        var p = document.createElement('p');
        p.innerHTML = item.get('quantity') + ' X ' + item.get('price').toFixed(2);
        var totp = document.createElement('p');
        totp.setAttribute('align', 'right');
        var price = item.get('price').toFixed(2);
        var textnode = document.createTextNode(item.get('quantity') * price);
        totp.appendChild(textnode);
        var aremove = document.createElement('a');
        aremove.setAttribute('class', 'secondary-content');
        var itemremovelogo = document.createElement('i');
        itemremovelogo.setAttribute('class', 'material-icons');
        itemremovelogo.innerHTML = 'close';
        //itemremovelogo.setAttribute('onclick','removeitem('+item+');');
        itemremovelogo.setAttribute('onclick', 'removeitem("' + item.id() + '");');
        aremove.appendChild(itemremovelogo);


        liElement.appendChild(spanelement);
        liElement.appendChild(p);
        liElement.appendChild(totp);
        liElement.appendChild(aremove);
        ulElement.appendChild(liElement);

        console.log(item.get('quantity') + ' x ' + item.get('name'));
    });

}


function removeitem(itemid) {

    var item = simpleCart.find(itemid);


    var qty = item.get('quantity');
    if (qty > 0) {
        qty--;
        item.set('quantity', qty);
    }
    else {

        item.remove();
    }
    loaditemtocart();
}


function validateOrder() {
    if (simpleCart.quantity() == 0) {
        Materialize.toast('Can t checkout! Your cart is Empty!', 4000, '', function () {
            alert('Please add some products to cart')
        })
    } else {

        window.location.href = '/order/checkout';
    }

}
function validateForCheckout() {
    if (simpleCart.quantity() == 0) {
        Materialize.toast('Can t checkout! Your cart is Empty!', 4000, '', function () {
            alert('Please add some products to cart')
        })
    } else {
        simpleCart.checkout();
        simpleCart.checkoutSuccess(alert("Checkout Successfully"));
        simpleCart.checkoutFail(alert("Checkout fail"));

    }

}
function goBack() {
    window.history.back();
}

$(document).ready(function () {
    // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
    $('.modal').modal();


});
$(window).load(function () {
    // executes when HTML-Document is loaded and DOM is ready
    loaditemtocart();

});
$('#filter').filterList();

