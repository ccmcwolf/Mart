<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html>
<head>
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="<@spring.url '/css/mystyle.css'/>" media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="<@spring.url '/css/materialize.min.css'/>" media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

</head>

<body>

<nav class="grey darken-4" role="navigation">
    <div class="nav-wrapper container">

        <a id="logo-container" href="#" class="brand-logo">Mart Online</a>
        <ul class="right hide-on-med-and-down">
            <li><a class="text-lighten-3" href="shops.html">Explore Shops</a></li>            <li><a class="text-lighten-3" href="products.html">Explore Foods</a></li>            <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>            <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>
        </ul>

        <ul id="nav-mobile" class="side-nav">
            <li><a class="text-lighten-3" href="shops.html">Explore Shops</a></li>            <li><a class="text-lighten-3" href="products.html">Explore Foods</a></li>            <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>            <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>
            <li><a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>
            </li>
        </ul>
        <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
        <br><br>

    </div>
</nav>
<div class="col s12 grey darken-4">
    <div class="container col s12">
        <a href="#!" class="breadcrumb">Explore</a>
        <a href="#!" class="breadcrumb">Shops</a>
        <a href="#!" class="breadcrumb">Products</a>
        <a href="#!" class="breadcrumb">Checkout</a>
    </div>
</div>
<ul id="slide-out" class="side-nav">
    <li>
        <div class="userView">
            <div class="background">
                <img src="https://s3-ap-southeast-1.amazonaws.com/martonline/office.jpg">
            </div>
            <a href="#!user"><img class="circle"
                                  src="https://s3-ap-southeast-1.amazonaws.com/martonline/sample1.jpg"></a>
            <a href="#!name"><span class="white-text name">John Doe</span></a>
            <a href="#!email"><span class="white-text email">jdandturk@gmail.com</span></a>
        </div>
    </li>
    <li><a class="text-lighten-3" href="shops.html">Explore Shops</a></li>            <li><a class="text-lighten-3" href="products.html">Explore Foods</a></li>            <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>            <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>
</ul>


<div class="section no-pad-bot" id="index-banner">

    <div class="container">
        <a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>

        <div class="row">
            <div class="col s9">
                <div class="grey center-align darken-3 white-text">
                    <h5>Place My Order</h5>
                </div>

                <form>
                    <div class="row">
                        <div class="input-field col s6">
                            <i class="material-icons prefix">shopping_basket</i>
                            <input id="order_id" type="text" class="validate">
                            <label for="order_id">Order ID</label>
                        </div>
                        <div class="input-field col s6">
                            <i class="material-icons prefix">account_circle</i>
                            <input id="name" type="tel" class="validate">
                            <label for="name">Recipient Name</label>

                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <i class="material-icons prefix">person_pin</i>
                            <input id="address" type="text" class="validate">
                            <label for="address">Address</label>
                        </div>

                    </div>

                    <div class="row">

                        <div class="input-field col s6">
                            <i class="material-icons prefix">business</i>
                            <input id="City" type="text" class="validate">
                            <label for="City">City</label>
                        </div>

                        <div class="input-field col s6">
                            <i class="material-icons prefix">email</i>
                            <input id="Email" type="email" class="validate">
                            <label for="Email">Email</label>
                        </div>


                    </div>

                    <div class="row">

                        <div class="input-field col s6">
                            <i class="material-icons prefix">phone</i>
                            <input id="phone" type="tel" class="validate">
                            <label for="phone">Phone</label>
                        </div>


                    </div>

                    <div class="row">

                        <div class="input-field col s6">

                            Delivery Date  <i class="material-icons prefix">today</i>
                            <input id="date" type="date" class="validate">

                        </div>


                        <div class="input-field col s6">

                            Delivery Time <i class="material-icons prefix">av_timer</i>
                            <input id="time" type="time" class="validate">
                        </div>
                    </div>


                    <div class="row">

                        <div class="input-field col s12 center-align">
                            <button class="btn waves-effect waves-light" type="submit" name="action">Submit
                                <i class="material-icons right">send</i>
                            </button>
                        </div>
                    </div>

                </form>
            </div>
            <div id="map_canvas"></div>
            <div class="s3">
                <div class="col s3 center grey darken-4 ">
                    <a><i class="material-icons white-text">shopping_cart</i>Small Cart</a>
                    <span id="smallcartbadge" class="new badge red" data-badge-caption="Items in cart"></span>
                    <div id='grandtotal' class="green">
                    </div>
                    <!--<a href="#" ><div class="blue-grey white-text">Checkout</div></a>-->

                    <ul class="collection" id="smallcart">
                        <li class="collection-item avatar">
                            <img src="https://s3-ap-southeast-1.amazonaws.com/martonline/office.jpg" alt=""
                                 class="circle">
                            <span class="uid" hidden>office.jpg</span>
                            <span class="title">Item Name</span>
                            $15.25 &nbsp; X &nbsp; 1

                            </p>
                            <p align="right">$45.00</p>
                            <a href="#!" class="secondary-content"><i class="material-icons">close</i></a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<#include "footer.ftl">

<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script><script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script type="text/javascript" src="js/jquery.filterList.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/rome/2.1.22/rome.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.17.1/moment.js"></script>
<script src="material-datetime-picker.js" charset="utf-8"></script>
<script type="text/javascript" src="js/simpleCart.js"></script>
<script>
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
            {view: 'image', attr: 'thumb', label: false},
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
            type: "PayPal",
            email: "you@yours.com"
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

    simpleCart.bind("afterAdd", function (item) {

        Materialize.toast(item.get("name") + " was added to the cart!", 4000);

        loaditemtocart();
    });
    function loaditemtocart() {
        $('.collection-item').remove();
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
    $(document).ready(function () {
        // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
        $('.modal').modal();
    });
    $(window).load(function () {
        // executes when HTML-Document is loaded and DOM is ready
        loaditemtocart();

    });
    $('#filter').filterList();


</script>

</body>
</html>
