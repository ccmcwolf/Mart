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
            <li><a class="text-lighten-3" href="shops.html">Explore Shops</a></li>
            <li><a class="text-lighten-3" href="products.html">Explore Foods</a></li>
            <li><a class="text-lighten-3" href="merchent.html">Merchant Area</a></li>
            <li><a class="text-lighten-3" href="admin.html">Admin Area</a></li>
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
        <a href="#!" class="breadcrumb">Admin</a>
        <a href="#!" class="breadcrumb">Courier</a>
        <a href="#!" class="breadcrumb">Add Courier</a>
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
                <h5>Add Courier</h5>
            </div>

        </div>

        <div class="row">
            <form id="addcourierform" method="post" class="col s12">

                <div class="row">
                <#--<div class="input-field col s6">-->
                <#--<i class="material-icons prefix">account_circle</i>-->
                <#--<input id="shop_id" name="courierId" type="text" class="validate" required>-->
                <#--<label for="shop_id">Courier ID</label>-->
                <#--</div>-->
                    <div class="input-field col s12">
                        <i class="material-icons prefix">store</i>
                        <input id="name" name="courierName" type="tel" class="validate" required>
                        <label for="name">Courier Name</label>
                    </div>
                </div>
                <div class="row">


                    <div class="input-field col s6">
                        <i class="material-icons prefix">verified_user</i>
                        <input id="nic" name="nic" type="number" class="validate" required>
                        <label for="nic">National Identity Card</label>
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="vehicleNo" name="vehicleNo" type="text" class="validate">
                        <label for="vehicleNo">Vehicle No</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col s12">
                        <i class="material-icons prefix">person_pin</i>
                        <input id="address" name="address" type="text" class="validate" required>
                        <label for="address">Address</label>
                    </div>

                </div>

                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">business</i>
                        <input id="City" name="city" type="text" class="validate">
                        <label for="City">City</label>
                    </div>

                    <div class="input-field col s6">
                        <i class="material-icons prefix">business</i>
                        <input id="Province" name="province" type="tel" class="validate">
                        <label for="Province">Province</label>
                    </div>
                </div>

                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">phone</i>
                        <input id="contactNo" name="contactNo" type="tel" minlength="10" maxlength="10" class="validate"
                               required>
                        <label for="contactNo">Phone Contact</label>
                    </div>

                    <div class="input-field col s6">
                        <i class="material-icons prefix">email</i>
                        <input id="Email" name="email" type="email" class="validate" required>
                        <label for="Email">Email</label>
                    </div>

                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <form id="fileUploadForm">
                            <div class="input-field col s6">
                                <i class="material-icons prefix">account_circle</i>
                                <input id="proimage" class="button" name="proimage" accept="image/*" type="file"
                                       class="validate">
                                <label for="proimage">Profile Picture</label>
                            </div>
                            <#--<div class="input-field col s3">-->
                                <#--<button id="btnUpload" class="btn waves-effect waves-light" name="action">Submit-->
                                    <#--<i class="material-icons right">send</i>-->
                                <#--</button>-->
                            <#--</div>-->
                        </form>
                    </div>
                    <div class="input-field col s6">
                        <button class="btn waves-effect waves-light" type="submit" name="action">Submit
                            <i class="material-icons right">send</i>
                        </button>
                    </div>


                </div>

            </form>
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
                    <li><a class="grey-text text-lighten-3" href="shops.html">Explore Shops</a></li>
                    <li><a class="grey-text text-lighten-3" href="products.html">Explore Foods</a></li>
                    <li><a class="grey-text text-lighten-3" href="merchent.html">Merchant Area</a></li>
                    <li><a class="grey-text text-lighten-3" href="admin.html">Admin Area</a></li>
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

<#--<script type="text/javascript" src="js/materialize.min.js"></script>-->
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script>$('.button-collapse').sideNav({
            menuWidth: 300, // Default is 300
            edge: 'right', // Choose the horizontal origin
            closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
            draggable: true // Choose whether you can drag to open on touch screens
        }
);


$(document).ready(function () {

    $("#btnUpload").click(function (event) {
        //stop submit the form, we will post it manually.

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {
    // Get form
    var form = $('#fileUploadForm');

    var data = new FormData(form);

    $.ajax({
        type: "POST",
        enctype: 'multipart/form-data',
        url: "/s3/upload",
        data: data,
        contentType: false,
        cache: false,
        timeout: 600000,
        success: function (data) {
            alert("Success" + data);
        },
        error: function (e) {
            alert("error"+e);

        }
    });

}


var urlv = "/courier/add"; // the script where you handle the form input.

$('#addcourierform').validate({
//        rules: {
//            field: {
//                required: true,
//                minlength: 3
//            }
//        }

    errorElement: "div",
    errorPlacement: function (error, element) {
        var placement = $(element).data('error');
        if (placement) {
            $(placement).append(error)
        } else {
            error.insertAfter(element);
        }
    },
    submitHandler: function (form) {
        $.ajax({
            type: "POST",
            url: urlv,
            data: $("#addcourierform").serialize(), // serializes the form's elements.
            success: function (response) {
                if (response.status == "SUCCESS") {
                    Materialize.toast(response.status, 4000);
                } else {
                    Materialize.toast(response.status, 4000);
                }
            },
            error: function (e) {
                Materialize.toast("Error", 4000);
            }
        });
    }
});


</script>

</body>
</html>
