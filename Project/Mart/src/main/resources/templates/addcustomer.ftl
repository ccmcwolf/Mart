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
        <a href="#!" class="breadcrumb">Customer</a>
        <a href="#!" class="breadcrumb">Customer Data</a>
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
                <h5>Add Customer</h5>
            </div>

        </div>
        <div class="row">
            <form id="customerform" class="col s12" action="/customer/add" method="GET">
                <div class="row">

                    <div class="input-field col s12">
                        <i class="material-icons prefix">person_pin</i>
                        <input id="customerName" name="customerName" type="text" class="validate" required>
                        <label for="customerName">Customer Name</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <i class="material-icons prefix">person_pin</i>
                        <input id="customer_address" name="customer_address" type="text" class="validate">
                        <label for="customer_address">Address</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">email</i>
                        <input id="customerEmail" name="customerEmail" type="email" class="validate" required>
                        <label for="customerEmail">Email</label>
                    </div>
                    <div class="input-field col s6">
                        <i class="material-icons prefix">account_circle</i>
                        <input id="Category" type="text" class="validate">
                        <label for="Category">Category</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">business</i>
                        <input id="city" name="city" type="text" class="validate" required>
                        <label for="city">City</label>
                    </div>

                    <div class="input-field col s6">
                        <i class="material-icons prefix">business</i>
                        <input id="district" name="district" type="tel" class="validate">
                        <label for="district">District</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s6">
                        <i class="material-icons prefix">phone</i>
                        <input id="mobileNo" name="mobileNo" type="number" minlength="10" maxlength="10"
                               class="validate" required>
                        <label for="mobileNo">Mobile Number</label>
                    </div>

                    <div class="file-field input-field col s6">
                        <div class="btn">
                            <span>File</span>
                            <input name="proimage" type="file" accept=".jpg">
                        </div>

                        <div class="file-path-wrapper">
                            <input id="lblpro" class="file-path validate" type="text">
                            <label for="lblpro">Select Profile Picture</label>
                        </div>
                    </div>
                </div>
                <div id="spinneritem" class="row center">
                    <div align="center" id="spinmap" class="preloader-wrapper active">
                        <div class="spinner-layer spinner-red-only">
                            <div class="circle-clipper left">
                                <div class="circle"></div>
                            </div>
                            <div class="gap-patch">
                                <div class="circle"></div>
                            </div>
                            <div class="circle-clipper right">
                                <div class="circle"></div>
                            </div>
                        </div>
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


    </div>
</div>
<#include "footer.ftl">

<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script>

    $(document).ready(function () {
        $("#spinneritem").hide();
    });

    $('.button-collapse').sideNav({
                menuWidth: 300, // Default is 300
                edge: 'right', // Choose the horizontal origin
                closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
                draggable: true // Choose whether you can drag to open on touch screens
            }
    );

    //var urlv = "/customer/add"; // the script where you handle the form input.

    //$('#customerform').validate({
    //        rules: {
    //            field: {
    //                required: true,
    //                minlength: 3
    //            }
    //        }
    //    errorElement: "div",
    //    errorPlacement: function (error, element) {
    //        var placement = $(element).data('error');
    //        if (placement) {
    //            $(placement).append(error)
    //        } else {
    //            error.insertAfter(element);
    //        }
    //    }
    //    ,
    //    submitHandler: function (form) {
    //
    //        event.preventDefault();
    //
    //        // Get form
    //        var form = $('#customerform')[0];
    //
    //        // Create an FormData object
    //        var data = new FormData(form);
    //
    //        // If you want to add an extra field for the FormData
    //        data.append("CustomField", "This is some extra data, testing");
    //
    //        // disabled the submit button
    //        $("#customerform").prop("disabled", true);
    //        $("#spinneritem").show();
    //
    //
    //        $.ajax({
    //            type: "GET",
    //            enctype: 'multipart/form-data',
    //            url: urlv,
    //            data: data,
    //            processData: false,
    //            contentType: false,
    //            cache: false,
    //            timeout: 600000,
    //            success: function (response) {
    //                if (response.status == "SUCCESS") {
    //                    Materialize.toast(response.status, 4000);
    //                    $("#spinneritem").hide();
    //                    $("#customerform")[0].reset();
    //                } else {
    //                    $("#spinneritem").hide();
    //                    Materialize.toast(response.status, 4000);
    //
    //                }
    //            },
    //            error: function (e) {
    //                Materialize.toast("Error", 4000);
    //            }
    //        });
    //}
    //});


</script>

</body>
</html>
