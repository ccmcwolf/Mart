<#import "/spring.ftl" as spring>
<html>

<head>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="<@spring.url '/css/materialize.min.css'/> media="screen,projection"/>
    <link type="text/css" rel="stylesheet" href="<@spring.url '/css/mystyle.css'/>" media="screen,projection"/>

</head>

<body>
<div class="section"></div>
<main>
    <center>
        <div class="center" style="width: 250px;" ><h3>Mart Shopping</h3></div>
        <div class="section"></div>

        <h5 class="indigo-text">Sorry, You are not authorized to access the page</h5>
        <div class="section"></div>

        <div class="container">
            <div class="z-depth-1 grey lighten-4 row" style="display: inline-block; padding: 32px 48px 0px 48px; border: 1px solid #EEE;">

            <h4>Please contact Mart Client Services to upgrade your account if you need access to this page<br> Contact +94 777773282 <br> Or Send a message from below form</h4>
                <div class='row'>
                    <div class='input-field col s12'>
                        <input class='validate' type='text' name='subject' id='subject' />
                        <label for='subject'>Subject</label>
                    </div>
                </div>

                <div class='row'>

                    <div class='input-field col s12'>
                        <input type='text' name='password' id='message' />
                        <label for='message'>Your Message</label>
                    </div>

                    <label style='float: right;'>
                        <a class='pink-text' href='#!'><b>Forgot Password?</b></a>
                    </label>
                </div>
            </div>
        </div>
        <a href="/">Return to Home</a>
    </center>

    <div class="section"></div>
    <div class="section"></div>
</main>

<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script>

</body>

</html>