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
        <a href="<@spring.url '/shop/explore'/>" class="breadcrumb">Shops</a>
        <a href="javascript:;" onclick="goBack();" class="breadcrumb">Products</a>

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
    <li><a class="text-lighten-3" href="shops.html">Explore Shops</a></li>
    <li><a class="text-lighten-3" href="products.html">Explore Foods</a></li>
    <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>
    <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>
</ul>


<div class="section no-pad-bot" id="index-banner">

    <div class="container">
        <a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>

        <div class="row">
        <#if orderid??>
            <div class="col s9">
                <div class="grey center-align darken-3 white-text">
                    <h5>Update Order Details</h5>
                </div>


                <form id="savedeliveryinfo" method="GET" action="<@spring.url '/order/updateorder'/>">
                    <div class="row">
                        <div class="input-field col s6">
                            <i class="material-icons prefix">shopping_basket</i>
                            <if></if>

                            <input id="orderNo" type="text" value="ORDID_${orderid}" disabled>
                            <label for="orderNo">Order ID</label>
                        </div>
                        <input type="hidden" name="orderNo" value="${orderid}"" ></input>
                        <input type="hidden" name="shopNo" value="${shopNo}"" ></input>
                        <input type="hidden" id="totalvalue" name="totalvalue"></input>
                        <div class="input-field col s6">
                            <i class="material-icons prefix">account_circle</i>
                            <input id="deliveryName" name="deliveryName" type="text" class="validate">
                            <label for="name">Recipient Name</label>

                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <i class="material-icons prefix">person_pin</i>
                            <input id="deliveryAddress" name="deliveryAddress" type="text" class="validate">
                            <label for="address">Address</label>
                        </div>
                    </div>

                    <div class="row">

                        <div class="input-field col s6">
                            <i class="material-icons prefix">business</i>
                            <input id="City" name="City" type="text" class="validate">
                            <select>
                                <option value="volvo">Volvo</option>
                                <option value="saab">Saab</option>
                                <option value="mercedes">Mercedes</option>
                                <option value="audi">Audi</option>
                            </select>
                            <label for="City">City</label>
                        </div>

                        <div class="input-field col s6">
                            <i class="material-icons prefix">email</i>
                            <input id="deliveryEmail" name="deliveryEmail" type="email" class="validate">
                            <label for="Email">Email</label>
                        </div>
                    </div>

                    <div class="row">
                        <div class="input-field col s6">
                            <i class="material-icons prefix">phone</i>
                            <input id="deliveryTelephoneNo" name="deliveryTelephoneNo" type="tel" class="validate">
                            <label for="phone">Phone</label>
                        </div>
                    </div>

                    <div class="row">

                        <div class="input-field col s6">

                            Delivery Date <i class="material-icons prefix">today</i>
                            <input id="datepicker" name="date"  type="date" class="validate">

                        </div>

                        <div class="input-field col s6">
                            Delivery Time <i class="material-icons prefix">av_timer</i>
                            <input id="deliveryTime" name="deliveryTime" type="time" class="validate">
                        </div>
                    </div>


                    <div class="row">

                        <div class="input-field col s12 center-align">
                            <a href="javascript:;">
                                <button class="btn waves-effect waves-light" onclick="formOnSubmit();" name="action">
                                    Save Order Details
                                    <i class="material-icons right">send</i>
                                </button>
                            </a>
                        </div>
                    </div>

                </form>

            </div>
        </#if>

            <div id="map_canvas"></div>
        <#if result??>
        <div class="s12 m6">

        <#else>
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

                    <a href="javascript:;" onclick="validateForCheckout()">
                        <div class="blue-grey white-text">Checkout</div>
                    </a>
                </div>
            </div>
        </#if>
        </div>
        </div>
    </div>
<#include "footer.ftl">

    <!--Import jQuery before materialize.js-->


    <script type="text/javascript" src="js/simpleCart.js"></script>
    <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
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
