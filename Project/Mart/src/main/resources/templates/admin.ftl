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
        <a href="#!" class="breadcrumb">Admin Area</a>

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
                <h5>Admin Area</h5>

            </div>

        </div>
        <div class="row">
            <div class=" col s12 m3">
                <div class="card-panel green accent-7 white-text center-align">
                    <i class="material-icons">verified_user</i><br>
                    <span class="white-text">Users</span>
                    <h3>3</h3>(This month)
                    <h3>12</h3>(Total)
                </div>
            </div>
            <div class=" col s12 m3">
                <div class="card-panel teal white-text center-align">
                    <i class="material-icons">store</i><br>
                    <span class="white-text">Merchants</span>
                    <h3>3</h3>(This month)
                    <h3>12</h3>(Total)
                </div>
            </div>
            <div class=" col s12 m3">
                <div class="card-panel orange white-text center-align">
                    <i class="material-icons">shopping_basket</i><br>
                    <span class="white-text">Orders</span>
                    <h3>3</h3>(This month)
                    <h3>12</h3>(Total)
                </div>
            </div>
            <div class=" col s12 m3">
                <div class="card-panel teal white-text center-align">
                    <i class="material-icons">shopping_cart</i><br>
                    <span class="white-text">Sales</span>
                    <h3>$300</h3>(This month)
                    <h3>$1200</h3>(Total)
                </div>
            </div>
        </div>
        <div class="row">
            <div class="mycard col s12">
                <ul class="tabs tabs-fixed-width">
                    <li class="tab col s3"><a href="#completedtab">Completed Orders</a></li>
                    <li class="tab col s3"><a class="active" href="#activeorders">Active Orders</a></li>

                    <li class="tab col s3"><a href="#revenue">Revenue Report</a></li>
                    <li class="tab col s3"><a href="#topselling">Top Products Selling</a></li>
                </ul>
            </div>


            <div id="activeorders" class="col s12">

                <div class="col s12">
                    <!--<div class="col s6 card horizontal">-->
                    <!--<div class="card-image">-->
                    <!--<img src="http://lorempixel.com/100/190/nature/6">-->
                    <!--</div>-->
                    <!--<div class="card-stacked">-->
                    <!--<div class="card-content">-->
                    <!--<p>I am a very simple card. I am good at containing small bits of information.</p>-->
                    <!--</div>-->
                    <!--<div class="card-action">-->
                    <!--<a href="#">This is a link</a>-->
                    <!--</div>-->
                    <!--</div>-->
                    <!--</div>-->
                    <input id="filter" placeholder="Search Anything on Orders" type="text"
                           class="validate">
                    <ul class="collapsible" data-collapsible="expandable">
                        <li>
                            <div class="collapsible-header"><i class="material-icons">place</i>Order #7456845

                                <div class="center-align">Order Date : 23-06-2017</div>
                                <div class="center-align">Delivery Time : 05:00 PM</div>
                                <div class="center-align">Order Total : $14</div>
                                <div id="getting-started"></div>

                            </div>
                            <table class="container collapsible-body highlight">
                                <thead>
                                <tr>
                                    <th>Product ID</th>
                                    <th>Product Name</th>
                                    <th>Status</th>
                                </tr>
                                </thead>

                                <tbody>
                                <tr>
                                    <td>PID45678754</td>
                                    <td>Small Pizza</td>
                                    <td><p>
                                        <input type="checkbox" id="test6"/>
                                        <label for="test6">Completed</label>
                                    </p></td>
                                </tr>
                                <tr>
                                    <td>Alvin</td>
                                    <td>Eclair</td>
                                    <td><p>
                                        <input type="checkbox" id="test7"/>
                                        <label for="test7">Completed</label>
                                    </p></td>
                                </tr>
                                <tr>
                                    <td>PID45678754</td>
                                    <td>Cheese Pizza Small</td>
                                    <td><p>
                                        <input type="checkbox" id="test8" checked="checked"/>
                                        <label for="test8">Completed</label>
                                    </p></td>
                                </tr>
                                <tr>
                                    <td colspan="3">
                                        <div class="center-align" onclick="alert('order completed');"> Select all and
                                            Mark
                                            as Order Completed
                                        </div>
                                    </td>
                                </tr>
                                </tbody>
                            </table>

                        </li>
                        <li>

                            <span class="collapsible-header"><i class="material-icons">done_all</i>Order #7656846

                                <div class="center-align">Order Date : 11-05-2017</div>
                                <div class="center-align">Delivery Time : 08:00 PM</div>
                                <div class="center-align">Order Total : $54</div>
                                <span class="countdown highlight"></span>
                            </span>

                            <table class="container collapsible-body highlight">
                                <thead>
                                <tr>
                                    <th>Product ID</th>
                                    <th>Product Name</th>
                                    <th>Status</th>
                                </tr>
                                </thead>

                                <tbody>
                                <tr>
                                    <td>Alvin</td>
                                    <td>Eclair</td>
                                    <td><p>
                                        <input type="checkbox" id="test36"/>
                                        <label for="test36">Completed</label>
                                    </p></td>
                                </tr>

                                <tr>
                                    <td colspan="3">
                                        <div class="center-align" onclick="alert('order completed');"> Select all and
                                            Mark
                                            as Order Completed
                                        </div>
                                    </td>
                                </tr>
                                </tbody>
                            </table>

                        </li>
                        <li>
                            <div class="collapsible-header"><i class="material-icons">whatshot</i>Order #7756845

                                <div class="center-align">Order Date : 21-05-2017</div>
                                <div class="center-align">Delivery Time : 07:00 PM</div>
                                <div class="center-align">Order Total : $24</div>

                            </div>
                            <table id="exporttable" class="container collapsible-body highlight">
                                <thead>
                                <tr>
                                    <th>Product ID</th>
                                    <th>Product Name</th>
                                    <th>Status</th>
                                </tr>
                                </thead>

                                <tbody>
                                <tr>
                                    <td>#756454544</td>
                                    <td>Eclair</td>
                                    <td><p>
                                        <input type="checkbox" id="test46"/>
                                        <label for="test46">Completed</label>
                                    </p></td>
                                </tr>
                                <tr>
                                    <td>Alvin</td>
                                    <td>Eclair</td>
                                    <td><p>
                                        <input type="checkbox" id="test57"/>
                                        <label for="test57">Completed</label>
                                    </p></td>
                                </tr>
                                <tr>
                                    <td>Alvin</td>
                                    <td>Eclair</td>
                                    <td><p>
                                        <input type="checkbox" id="test18" checked="checked"/>
                                        <label for="test18">Completed</label>
                                    </p></td>
                                </tr>
                                <tr>
                                    <td colspan="3">
                                        <div class="center-align" onclick="alert('order completed');"> Select all and
                                            Mark
                                            as Order Completed
                                        </div>
                                    </td>
                                </tr>
                                </tbody>
                            </table>

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
                        <td>#74645454</td>
                        <td>05/03/2017</td>
                        <td>05/05/2017</td>
                        <td>17:50</td>
                        <td>Completed</td>
                        <td>$25</td>
                    </tr>
                    <tr>
                        <td>#74645454</td>
                        <td>05/03/2017</td>
                        <td>05/05/2017</td>
                        <td>17:50</td>
                        <td>Completed</td>
                        <td>$18.00</td>
                    </tr>

                    </tbody>
                </table>

            </div>

            <div id="revenue" class="col s12">
                <table id="shoptable">
                    <thead>
                    <tr>
                        <th>Shop ID</th>
                        <th>Shop Name</th>
                        <th>City</th>
                        <th>Contact</th>
                        <th>Total No Orders</th>
                        <th>Total Revenue</th>
                    </tr>
                    </thead>

                    <tbody>
                    <tr>
                        <td>S0564784</td>
                        <td>Shandong</td>
                        <td>Rajagiriya, Colombo</td>
                        <td>0117845985</td>
                        <td>45</td>
                        <td>$1500.87</td>
                    </tr>
                    <tr>
                        <td>S0564784</td>
                        <td>Chinease Dragon</td>
                        <td>Bambalapitiya, Colombo</td>
                        <td>0112547896</td>
                        <td>25</td>
                        <td>$1009.00</td>
                    </tr>
                    <tr>
                        <td>S0564785</td>
                        <td>Pizza Hut</td>
                        <td>Malabe, Colombo</td>
                        <td>0112729729</td>
                        <td>41</td>
                        <td>$1800.00</td>
                    </tr>

                    </tbody>
                </table>
            </div>
            <div id="topselling" class="col s12">
                <ul class="collection" id="smallcart">
                    #1
                    <li class="collection-item avatar">

                        <img src="https://s3-ap-southeast-1.amazonaws.com/martonline/office.jpg" alt="" class="circle">
                        <span class="uid" hidden>office.jpg</span>
                        <span class="title">Item Name</span>
                        $15.25 &nbsp; X &nbsp; 1
                        <span>By Shandong</span>
                        </p>
                        <p align="right">$45.00</p>

                    </li>

                    #2
                    <li class="collection-item avatar">

                        <img src="https://s3-ap-southeast-1.amazonaws.com/martonline/office.jpg" alt="" class="circle">
                        <span class="uid" hidden>office.jpg</span>
                        <span class="title">Item Name</span>
                        $15.25 &nbsp; X &nbsp; 1
                        <span>By Chinese Dragon</span>
                        </p>
                        <p align="right">$45.00</p>

                    </li>
                    #3
                    <li class="collection-item avatar">

                        <img src="https://s3-ap-southeast-1.amazonaws.com/martonline/office.jpg" alt="" class="circle">
                        <span class="uid" hidden>office.jpg</span>
                        <span class="title">Item Name</span>
                        $15.25 &nbsp; X &nbsp; 1
                        <span>By Pizza Hut</span>
                        </p>
                        <p align="right">$45.00</p>

                    </li>
                </ul>
            </div>


        </div>
        <div class="row">
            <div class="col s12">
                <div class="card-panel green darken-3 white-text center-align">
                    <i class="material-icons">store</i><br>
                    <span class="white-text"><h4>Manage Store</h4></span>

                </div>
            </div>
        </div>
        <div class="row">
            <div class="col s12">
                <div class="card-panel red darken-3 white-text center-align">
                    <i class="material-icons">settings</i><br>
                    <span class="white-text"><h4>Store Settings</h4></span>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
<#include "footer.ftl">

<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script><script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script type="text/javascript" src="js/jquery.countdown.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.bundle.js"></script>
<script type="text/javascript" src="js/jquery.filterList.js"></script>

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
    $('#shoptable').DataTable();
});
$(document).ready(function () {
    $('ul.tabs').tabs('select_tab', 'tab_id');
});

$('#filter').filterList();

$("#getting-started")
        .countdown("2017/07/01", function (event) {
            $(this).text(
                    event.strftime('%D days %H:%M:%S')
            );
        });
</script>

</body>
</html>
