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
            <li><a class="text-lighten-3 active" src="<@spring.url '/shop/explore'/>">Explore Shops</a></li>
            <li><a class="text-lighten-3" src="<@spring.url '/products'/>">Explore Foods</a></li>
            <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>
            <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>
            <li><a class="text-lighten-3" href="login.html">Login</a></li>
            <li><a class="text-lighten-3" href="signup.html">Signup</a></li>
        </ul>

        <ul id="nav-mobile" class="side-nav">
            <li><a class="text-lighten-3" src="<@spring.url '/explore'/>">Explore Shops</a></li>
            <li><a class="text-lighten-3" src="<@spring.url '/products'/>">Explore Foods</a></li>
            <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>
            <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>

            <li><a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>
            </li>
        </ul>
        <a href="#" data-activates="nav-mobile" class="button-collapse"><i class="material-icons">menu</i></a>
        <br><br>

    </div>
</nav>
<div class="carousel carousel-slider center" data-indicators="true">
    <div class="carousel-fixed-item center">
        <h4 class="white-text">Delivering</h4>
        <h4 class="white-text">Deliciousness</h4>
        <p class="lighten-2 white-text">Ordering food from your favourite restaurant</p>
        <a class="btn waves-effect red white-text" href="login.html">Signup Now</a>
    </div>
    <div class="carousel-item green white-text" href="#one!">
        <img src="https://lorempixel.com/800/300/food/3">

    </div>
    <div class="carousel-item amber white-text" href="#two!">
        <h2>Second Panel</h2>
        <p class="white-text">This is your second panel</p>
    </div>
    <div class="carousel-item red white-text" href="#three!">
        <h2>Third Panel</h2>
        <p class="white-text">This is your third panel</p>
    </div>
</div>

<!--<form method="POST" enctype="multipart/form-data"-->
<!--action="/s3/upload">-->
<!--File to upload: <input type="file" name="file"><br /> Name: <input-->
<!--type="text" name="name"><br /> <br /> <input type="submit"-->
<!--value="Upload"> Press here to upload the file!-->
<!--</form>-->

<div class="container">
    <div class="section">
        <h2 class="black-text center">How It Works</h2>
        <!--   Icon Section   -->
        <div class="row">
            <div class="col s12 m3">
                <div class="icon-block">
                    <h2 class="center light-blue-text"><img src="http://demo.yoyumm.com/images/info_icon_1.svg"></h2>
                    <h5 class="center">1. Search</h5>

                    <p class="light center">Find your restaurant using advanced location based search filter.</p>
                </div>
            </div>
            <div class="col s12 m3">
                <div class="icon-block">
                    <h2 class="center light-blue-text"><img src="http://demo.yoyumm.com/images/info_icon_2.svg"></h2>
                    <h5 class="center">2. Choose</h5>

                    <p class="light center">Select a best fit and appropriate restaurant which fulfills your binge and taste buds.</p>
                </div>
            </div>
            <div class="col s12 m3">
                <div class="icon-block">
                    <h2 class="center light-blue-text"><img src="http://demo.yoyumm.com/images/info_icon_3.svg"></h2>
                    <h5 class="center">3. Pay</h5>

                    <p class="light center">Make payment using instant and secured online process or cash on delivery.</p>
                </div>
            </div>
            <div class="col s12 m3">
                <div class="icon-block">
                    <h2 class="center light-blue-text"><img src="http://demo.yoyumm.com/images/info_icon_4.svg"></h2>
                    <h5 class="center">4. Enjoy</h5>

                    <p class="light center">Celebrate and have a good time enjoying your chosen delicacy.</p>
                </div>
            </div>
        </div>
    </div>
    <br><br>
</div>
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
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script>
    $('.carousel.carousel-slider').carousel({fullWidth: true});
    $(document).ready(function () {
        $('.parallax').parallax();
    });
</script>
</body>
</html>
