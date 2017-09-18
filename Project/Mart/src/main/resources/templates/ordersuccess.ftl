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

<#include "navbar.ftl">

<div class="col s12 grey darken-4">
    <div class="container col s12">
        <a href="#!" class="breadcrumb">Explore</a>
        <a href="#!" class="breadcrumb">Success</a>
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
    <li><a class="text-lighten-3" href="shops.html">Explore Shops</a></li>
    <li><a class="text-lighten-3" href="products.html">Explore Foods</a></li>
    <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>
    <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>
</ul>


<div class="section no-pad-bot" id="index-banner">

    <div class="container">
        <a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>
        <div class="row">
            <div class="col s12">
                <div class="grey center-align darken-3 white-text">
                    <h5>Congratulation! Order Placed Succussfully</h5>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col s9">


                <div class="row">
                    <div class="input-field col s6">
                    <#if orders.orderNo??>
                        <i class="material-icons prefix">shopping_basket</i>
                        <input id="order_id" type="text" value="${orders.orderNo}" class="validate" disabled>
                        <label for="order_id">Order ID</label>
                    </#if>
                    </div>
                    <div class="input-field col s6">
                    <#if orders.deliveryName??>
                        <i class="material-icons prefix">account_circle</i>
                        <input id="name" type="text" value="${orders.deliveryName}" class="validate" disabled>
                        <input id="name" type="text" value="${orders.deliveryName}" class="validate" disabled>
                        <label for="name">Recipient Name</label>
                    </#if>

                    </div>
                </div>
                <div class="row">
                <#if orders.deliveryAddress??>
                    <div class="input-field col s12">
                        <i class="material-icons prefix">person_pin</i>
                        <input id="address" type="text" value="${orders.orderNo}" class="validate" disabled>
                        <label for="address">Address</label>
                    </div>
                </#if>

                </div>

                <div class="row">

                    <div class="input-field col s6">
                    <#if orders.city??>
                        <i class="material-icons prefix">business</i>
                        <input id="City" type="text" value="${orders.city}" class="validate" disabled>
                        <label for="City">City</label>
                    </#if>
                    </div>

                    <div class="input-field col s6">
                    <#if orders.deliveryEmail??>
                        <i class="material-icons prefix">email</i>
                        <input id="Email" type="text" value="${orders.deliveryEmail}" class="validate" disabled>
                        <label for="Email">Email</label>
                    </#if>
                    </div>


                </div>

                <div class="row">

                <#if orders.deliveryTelephoneNo??>
                    <div class="input-field col s6">
                        <i class="material-icons prefix">phone</i>
                        <input id="phone" type="text" value="${orders.deliveryTelephoneNo}" class="validate" disabled>
                        <label for="phone">Phone</label>
                    </div>
                </#if>

                </div>

                <div class="row">

                    <div class="input-field col s6">
                    <#if orders.date??>
                        Delivery Date <i class="material-icons prefix">today</i>
                        <input id="date" type="text" value="${orders.date}" class="validate" disabled>
                    </#if>
                    </div>


                    <div class="input-field col s6">
                    <#if orders.deliveryTime??>
                        Delivery Time <i class="material-icons prefix">av_timer</i>
                        <input id="time" type="text" value="${orders.deliveryTime}" class="validate" disabled>
                    </#if>
                    </div>
                </div>

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
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.filterList.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/material-datetime-picker.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.filterList.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/simpleCart.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/productscript.js'/>"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/rome/2.1.22/rome.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.17.1/moment.js"></script>


</body>
</html>
