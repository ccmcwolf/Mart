<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html>
<head>
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="<@spring.url '/css/mystyle.css'/>" media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="<@spring.url '/css/merchant.css'/>" media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="https://cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css"
          media="screen,projection"/>

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
        <a href="#!" class="breadcrumb">Login</a>
        <a href="#!" class="breadcrumb">Delivery Agent Area</a>

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

        <br><br>
        <a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>

        <div class="row">

            <div class="col s12 grey center-align darken-3 white-text">
                <h5>Delivery Agent Area</h5>

            </div>

        </div>
        <div class="row">
            <div class="col s12 m4">
                <div class="card-panel orange accent-3 white-text center-align">
                    <i class="material-icons">shopping_basket</i><br>
                    <span class="white-text">Orders to be delivered</span>
                    <h3>3</h3>
                </div>
            </div>
            <div class="col s12 m4">
                <div class="card-panel teal white-text center-align">
                    <i class="material-icons">shopping_basket</i><br>
                    <span class="white-text">Total Number of Delivered Orders</span>
                    <h3>24</h3>
                </div>
            </div>
            <div class="col s12 m4">
                <div class="card-panel teal white-text center-align">
                    <i class="material-icons">shopping_cart</i><br>
                    <span class="white-text">Total Sales</span>
                    <h3>$12.00</h3>
                </div>
            </div>
        </div>
        <div class="row">

            <div class="col s12">
                <ul class="tabs tabs-fixed-width">
                    <li class="tab col s3"><a href="#completedtab">Completed Orders</a></li>
                    <li class="tab col s3"><a class="active" href="#activeorders">Active Orders</a></li>


                </ul>
            </div>
            <div id="activeorders" class="col s12">

                <div class="col s12">

                    <ul class="collapsible" data-collapsible="expandable">

                        <li>
                            <div class="col s12 m12">

                                <div class="card horizontal">
                                    <div class="card-image">
                                        <img src="http://lorempixel.com/100/220/food/6">
                                    </div>
                                    <div class="card-stacked">
                                        <div class="card-content">
                                            <div class="getting-started" class="right-align"></div>
                                            <div class="left-align">Order #784754</div>
                                            <div class="left-align">Order of <b>Chinese Dragon</b> </div>
                                            <div class="right-align">Order Date : 23 - 06 - 2017</div>
                                            <div class="right-align">Delivery Time : 05:00 PM</div>
                                            <p class="left-align">Contact Person : Chamith Chathuka</p>
                                            <p class="left-align">Delivery Adress : 69/1 Horahena Road Hokandara East</p>
                                            <p class="left-align">Phone Number : 0702178300</p>
                                            <div class="right-align">Delivery Charges : $2</div>
                                            <div class="right-align">Order Total : $14</div>

                                            <div class="right-align">Paid Status : Paid</div>

                                        </div>
                                        <div class="card-action">
                                            <a href="#modal1">Order Details</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </li>

                    </ul>
                    <ul class="collapsible" data-collapsible="expandable">

                        <li>
                            <div class="col s12 m12">

                                <div class="card horizontal">
                                    <div class="card-image">
                                        <img src="http://lorempixel.com/100/220/food/7">
                                    </div>
                                    <div class="card-stacked">
                                        <div class="card-content">
                                            <div class="getting-started" class="right-align"></div>
                                            <div class="left-align">Order #784754</div>
                                            <div class="left-align">Order of <b>Shandong</b></div>
                                            <div class="right-align">Order Date : 23 - 06 - 2017</div>
                                            <div class="right-align">Delivery Time : 05:00 PM</div>
                                            <p class="left-align">Contact Person : Chamith Chathuka</p>
                                            <p class="left-align">Delivery Adress : 69/1 Horahena Road Hokandara East</p>
                                            <p class="left-align">Phone Number : 0702178300</p>
                                            <div class="right-align">Delivery Charges : $2</div>
                                            <div class="right-align">Order Total : $16</div>
                                            <div class="right-align">Paid Status : Paid</div>
                                        </div>
                                        <div class="card-action">
                                            <a href="#modal1">Order Details</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </li>

                    </ul>


                </div>

            </div>
            <div id="completedtab" class="col s12">

                <table id="completedorders">
                    <thead>
                    <tr>
                        <th>Order ID</th>
                        <th>Ordered Date</th>
                        <th>Delievered Date</th>
                        <th>Delievered Time</th>
                        <th>Order Status</th>
                        <th>Order Total</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr>
                        <td>#74645454</td>
                        <td>05/03/2017</td>
                        <td>05/05/2017</td>
                        <td>17:50</td>
                        <td>Completed</td>
                        <td>$10.87</td>
                    </tr>
                    <tr>
                        <td>#74645455</td>
                        <td>05/03/2017</td>
                        <td>05/05/2017</td>
                        <td>17:50</td>
                        <td>Completed</td>
                        <td>$25</td>
                    </tr>
                    <tr>
                        <td>#74645456</td>
                        <td>05/03/2017</td>
                        <td>05/05/2017</td>
                        <td>17:50</td>
                        <td>Completed</td>
                        <td>$18.00</td>
                    </tr>

                    </tbody>
                </table>

            </div>


        </div>

    </div>
    <div id="modal1" class="modal">
        <div class="modal-content">
            <h4>Order Details</h4>
            <table >
                <thead>
                <tr>
                    <th>Product ID</th>
                    <th>Product Name</th>

                </tr>
                </thead>

                <tbody>
                <tr>
                    <td>PID457645</td>
                    <td>Cheese Pizza - Small x1</td>

                </tr>
                <tr>
                    <td>PID455751</td>
                    <td>Chocolate Donut x1</td>

                </tr>
                <tr>
                    <td>PID455756</td>
                    <td>Coke 2000ML</td>

                </tr>
                <tr>
                    <td colspan="3">
                        <div class="center-align" onclick="alert('Order Completed');"> Select all and
                            Mark
                            as Order Delivered
                        </div>
                    </td>
                </tr>

                </tbody>
            </table>


            <div class="modal-footer">
                <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat">Close</a>
            </div>
            <div id="map"></div>
        </div>

    </div>
</div>
</body>
<footer class="page-footer">
    <div class="container">
        <div class="row">
            <div class="col l6 s12">
                <h5 class="white-text">Mart Online Shopping</h5>
                <p class="grey-text text-lighten-4">@2017</p>
            </div>
            <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Links</h5>
                <ul>
                    <li><a class="grey-text text-lighten-3" href="#!">Explore Foods</a></li>
                    <li><a class="grey-text text-lighten-3" href="#!">Explore Shops</a></li>
                    <li><a class="grey-text text-lighten-3" href="#!">Merchant Area</a></li>
                    <li><a class="grey-text text-lighten-3" href="#!">Admin Area</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="footer-copyright">
        <div class="container">

            <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
        </div>
    </div>
</footer>


<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script><script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script type="text/javascript" src="js/jquery.countdown.js"></script>

<script>$('.button-collapse').sideNav({
            menuWidth: 300, // Default is 300
            edge: 'right', // Choose the horizontal origin
            closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
            draggable: true // Choose whether you can drag to open on touch screens
        }
);
$(document).ready(function () {
    $('ul.tabs').tabs();
    $('#completedorders').DataTable();
});
$(document).ready(function () {
    $('ul.tabs').tabs('select_tab', 'tab_id');
    $('.modal').modal();
});


$(".getting-started")
        .countdown("2017/07/01", function (event) {
            $(this).text(
                    event.strftime('%D days %H:%M:%S')
            );
        });

var map;
function initMap() {
    map = new google.maps.Map(document.getElementById('map'), {
        center: {lat: -34.397, lng: 150.644},
        zoom: 8
    });
}
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCklaZgoS2Kj0lC_Sq2jyB6w0aOwZw6N0Y&callback=initMap"
        async defer></script>
</body>
</html>
