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

    <!-- Modal Structure -->
    <div id="modal1" class="modal">
        <div class="modal-content">
            <h4>Modal Header</h4>
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
                    <div class="row modal-footer">

                        <div class="input-field col s12 center-align">
                            <button class="btn waves-effect waves-light " type="submit" name="action">Submit
                                <i class="material-icons right">send</i>
                            </button>
                        </div>


                    </div>

                </form>

            </div>
        </div>

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

                    <p class="light center">Select a best fit and appropriate restaurant which fulfills your binge and
                        taste buds.</p>
                </div>
            </div>
            <div class="col s12 m3">
                <div class="icon-block">
                    <h2 class="center light-blue-text"><img src="http://demo.yoyumm.com/images/info_icon_3.svg"></h2>
                    <h5 class="center">3. Pay</h5>

                    <p class="light center">Make payment using instant and secured online process or cash on
                        delivery.</p>
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
<#include "footer.ftl">
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script>
    $('.carousel.carousel-slider').carousel({fullWidth: true});
    $(document).ready(function () {
        $('#modal1').modal('open');
        $('.parallax').parallax();
    });

    $('.modal').modal({
                dismissible: false, // Modal can be dismissed by clicking outside of the modal
                opacity: 0.3, // Opacity of modal background
                inDuration: 300, // Transition in duration
                outDuration: 200, // Transition out duration
                startingTop: '4%', // Starting top style attribute
                endingTop: '10%', // Ending top style attribute
                ready: function (modal, trigger) { // Callback for Modal open. Modal and trigger parameters available.
                    console.log(modal, trigger);
                }

            }
    );
</script>
</body>
</html>
