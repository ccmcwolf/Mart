<!DOCTYPE html>
<html>
<head>
    <!--Import Google Icon Font-->
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="css/shopcss.css" media="screen,projection"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.css">


    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

</head>

<body>

<nav class="grey darken-4" role="navigation">
    <div class="nav-wrapper container">

        <a id="logo-container" href="#" class="brand-logo">Mart Online</a>
        <ul class="right hide-on-med-and-down">
            <li><a href="login.html">Login</a></li>
            <li><a href="signup.html">Signup</a></li>
        </ul>

        <ul id="nav-mobile" class="side-nav">
            <li><a class="text-lighten-3" href="shops.html">Explore Shops</a></li>
            <li><a class="text-lighten-3" href="products.html">Explore Foods</a></li>
            <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>
            <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>
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
        <br><br>
        <a href="#" data-activates="slide-out" class="button-collapse"><i class="material-icons">menu</i></a>

        <div class="row">

            <div class="col s12 grey center-align darken-3 white-text">
                <h5>Explore Shops</h5>
            </div>

        </div>
        <div class="row">
            <div class="col s3">

                <div class="collection">
                    <a href="#!" onclick="filtermethodcall(this);" class="collection-item">Alvin</a>
                    <a href="#!" class="collection-item active">Alvin</a>
                    <a href="#!" class="collection-item">Alvin</a>
                    <a href="#!" class="collection-item">Alvin</a>
                </div>
            </div>
            <div class="col s9">
                <form>

                    <div class="input-field">

                    </div>
                    <input id="filter" placeholder="Search Ex - Area, Price, Food Name, Description, Category" type="text"
                           class="validate">

                    <ul class="list row">
                        <li class="col s6 card horizontal">
                            <div class="card-image">
                                <img src="img/food-h-c-150-400-1.jpg">
                            </div>
                            <div class="card-stacked">
                                <div class="card-content">
                                    <h5 class="name"><a href="products.html">Cafe Fort</a></h5>
                                    <p>Fort, Colombo. Pizza</p>
                                </div>
                                <div class="card-action">
                                    <div class="rateYo"></div>
                                    <a href="#">More info</a>
                                </div>
                            </div>

                        </li>
                        <li class="col s6 card horizontal">

                            <div class="card-image">
                                <img src="img/food-h-c-150-400-3.jpg">

                            </div>
                            <div class="card-stacked">
                                <div class="card-content">
                                    <h5 class="name"><a href="products.html">Aasife</a></h5>
                                    <p>Rajagiriya, Colombo. Casual Dining</p>
                                </div>
                                <div class="card-action">
                                    <div class="rateYo"></div>
                                    <a href="#">More info</a>
                                </div>
                            </div>

                        </li>
                        <li class="col s6 card horizontal">
                            <div class="card-image">
                                <img src="img/food-h-c-150-400-6.jpg">
                            </div>
                            <div class="card-stacked">
                                <div class="card-content">
                                    <h5 class="name"><a href="products.html">Shandong</a></h5>
                                    <p>Rajagiriya, Colombo. Casual Dining</p>
                                </div>
                                <div class="card-action">
                                    <div class="rateYo"></div>
                                    <a href="#">More info</a>
                                </div>
                            </div>
                        </li>
                        <li class="col s6 card horizontal">
                            <div class="card-image">
                                <img src="img/food-h-c-150-400-9.jpg">

                            </div>
                            <div class="card-stacked">
                                <div class="card-content">
                                    <h5 class="name"><a href="products.html">Chinese Dragon</a></h5>
                                    <p>Bambalapitiya, Colombo 04· Casual Dining</p>

                                </div>
                                <div class="card-action">
                                    <div class="rateYo"></div>
                                    <a href="#modal1">More info</a>
                                </div>
                            </div>
                        </li>
                        <li class="col s6 card horizontal">
                            <div class="card-image">
                                <img src="img/food-h-c-150-400-7.jpg">

                            </div>
                            <div class="card-stacked">
                                <div class="card-content">
                                    <h5 class="name"><a href="products.html">Hotel de Pillawoos</a></h5>
                                    <p>Bambalapitiya, Colombo 04· Casual Dining</p>

                                </div>
                                <div class="card-action">
                                    <div class="rateYo"></div>
                                    <a href="#modal1">More info</a>
                                </div>
                            </div>
                        </li>
                    </ul>
                </form>
            </div>
        </div>
    </div>
    <!-- Modal Structure -->
    <div id="modal1" class="modal">
        <div class="modal-content">
            <h4>Pilawoos (Open: 09:00 AM - 03:00 AM)</h4>
            <div><img class="responsive-img"
                      src="https://s3-ap-southeast-1.amazonaws.com/cdn.quickee.lk/4619/conversions/profile_thumb.jpg"/>
                <div>Hotel De Pilawoos (Colombo -3) is one of the most popular 24 hours eateries in
                    Colombo which has been
                    serving customers for over 20 years!
                </div>
            </div>


        </div>
        <div class="modal-footer">
            <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat">Close</a>
        </div>
    </div>
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

<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
<script type="text/javascript" src="js/jquery.filterList.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.js"></script>

<script>$('.button-collapse').sideNav({
            menuWidth: 300, // Default is 300
            edge: 'right', // Choose the horizontal origin
            closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
            draggable: true // Choose whether you can drag to open on touch screens
        }
);

$(document).ready(function () {
    $('.modal').modal();
});


function filtermethodcall() {
    var ul = document.getElementById('bulk'); // Parent

    ul.addEventListener('click', function (e) {
        var target = e.target; // Clicked element

        if (target.tagName === 'LI'){
            alert(target.id); // Check if the element is a LI
        }
    });
}

$(function () {

    $(".rateYo").rateYo({
        rating: 4.5,
        starWidth: "20px",
        onSet: function (rating, rateYoInstance) {

            alert("Rating is set to: " + rating);
        }
    });

    $('#filter').filterList();


});

</script>


</body>
</html>
