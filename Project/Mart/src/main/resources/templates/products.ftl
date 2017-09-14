<#import "/spring.ftl" as spring>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/html">
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
        <a href="<@spring.url '/shop/explore'/>" class="breadcrumb">Explore</a>
        <a href="#!" class="breadcrumb">Shops</a>
        <a href="#!" class="breadcrumb">Products</a>
    </div>
</div>


<div class="section no-pad-bot" id="index-banner">

    <div class="container">

        <br><br>
        <a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>

        <div class="row">

            <div class="col s9">
                <ul class="tabs">
                    <li class="tab col s6 grey darken-4 white-text"><a class="white-text" href="#test1"><i
                            class="material-icons white-text">shopping_basket</i>Products</a></li>

                    <li class="tab col s6 grey darken-4 white-text"><a class="white-text" href="#test2"><i
                            class="material-icons white-text">store</i>About</a></li>
                </ul>
            </div>
            <div class="col s3 center grey darken-4 white-text">
                <a class="white-text"><i class="material-icons white-text">shopping_cart</i>Small Cart</a>
                <span id="smallcartbadge" class="new badge red" data-badge-caption="Items in cart"></span>
                <div id='grandtotal' class="green">
                </div>
                    <a href="javascript:;" class="simpleCart_checkout">
                    <div class="blue-grey white-text">Checkout</div>
                </a>

            </div>


            <div id="test1" class="col s9 ">
                <div class="input-field">
                    <!--<i class="material-icons prefix">search</i>-->
                </div>
                <input id="filter" placeholder="Search" type="text" class="validate">

                <ul class="list row">

                    <#list products as product>
                    <li class="col s4">
                        <div class="card simpleCart_shelfItem">
                            <div class="card-image">
                                <#if product.imagePath?has_content>
                                      <img class="item_path"  src="<@spring.url "${product.imagePath}"/>">

                                <#else>
                                    <img src="<@spring.url '/img/food-h-c-150-400-1.jpg'/>">

                                </#if>


                                <a href="javascript:;"
                                   class="btn-floating halfway-fab waves-effect waves-light red item_add"><i
                                        class="material-icons">add</i></a>

                            </div>
                            <div class="card-content">
                                <#if product.name??>

                                    <span class="card-title item_name">${product.name}</span>
                                    <#--<input type="hidden" class="item_no" value="${product.productId}"/>-->
                                    <span class="item_itemId hiddendiv">${product.productId}</span>
                                </#if>

                                <#if product.description??>
                                    <p> ${product.description}</span>
                                    </p><br>
                                </#if>

                            </div>
                            <div class="card-action">
                                <span class="new badge red item_price" data-badge-caption="price">
                                    <#if product.unitPrice??>
                                    ${product.unitPrice}
                                    </#if>
                                    </span>
                                <#if product.name??>
                                    <a href="#modal${product.name}"> More info </a>
                                </#if>
                            </div>
                        </div>
                    </li>
                        <#if product.name??>



                        <!-- Modal Structure -->
                        <div id="modal${product.name}" class="modal">
                            <div class="modal-content">
                                <h4>${product.name}</h4>
                                <#if product.description??>
                                <p>${product.description}</p>
                                </#if>
                                <h5>Ingredients</h5>
                                <p>

                                    Enriched bleached flour (wheat flour, malted barley flour, niacin, reduced iron, thiamin mononitrate,
                                    riboflavin, folic acid), water, high fructose corn syrup, soybean oil, contains less than 2% of yeast, salt,
                                    mono- and diglycerides,
                                    hydroxylated soy lecithin, cultured wheat flour, vinegar, enzymes, calcium sulfate, ascorbic acid, calcium
                                    peroxide,
                                    azodicarbonamide, fumaric acid, acetic acid, citric acid, lactic acid, sodium stearoyl lactylate, wheat
                                    gluten, calcium propionate (preservative), soy lecithin.
                                    Contains soy, wheat.
                                    May contain milk.
                                </p></#if>
                            </div>
                            <div class="modal-footer">
                                <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat">Close</a>
                            </div>
                        </div>

                </#list>


                </ul>

            </div>
            <div id="test2" class="col s9">

                <ul id="smallullist" class="collection">
                    <li class="collection-item avatar">
                        <img class="item_thumb" src="http://lorempixel.com/output/food-q-c-640-480-4.jpg"
                             thumb="https://s3-ap-southeast-1.amazonaws.com/martonline/office.jpg" alt=""
                             class="circle">
                        <span class="title">Item Name</span>
                        <p>X 1<br>$15.25

                        </p>
                        <p align="right">$45.00</p>
                        <a href="#!" class="secondary-content"><i class="material-icons">close</i></a>
                    </li>
                    <li class="collection-item avatar">
                        <i class="material-icons circle">folder</i>
                        <span class="title">Title</span>
                        <p>First Line <br>
                            Second Line
                        </p>
                        <a href="#!" class="secondary-content"><i class="material-icons">close</i></a>
                    </li>
                    <li class="collection-item avatar">
                        <i class="material-icons circle green">insert_chart</i>
                        <span class="title">Title</span>
                        <p>First Line <br>
                            Second Line
                        </p>
                        <a href="#!" class="secondary-content"><i class="material-icons">close</i></a>
                    </li>

                </ul>

            </div>
            <div class="col s3">

                <ul class="collection" id="smallcart">
                    <li class="collection-item avatar">
                        <img src="https://s3-ap-southeast-1.amazonaws.com/martonline/office.jpg" alt="" class="circle">
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


        <br><br>

    </div>
</div>


<#include "footer.ftl">

<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.filterList.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/simpleCart.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/productscript.js'/>"></script>

</body>
</html>
