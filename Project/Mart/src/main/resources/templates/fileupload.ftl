<#import "/spring.ftl" as spring>
<html>
<body>
<form id="upform"  enctype="multipart/form-data"
      >
    File to upload: <input type="file" name="file"><br />
    Cat Id<input type="text" name="name"/>
    Name: <input type="text" name="categoryName"><br /> <br />
    Name: <input type="text" name="tag"><br /> <br />
    Name: <input type="text" name="tag1"><br /> <br />
    Name: <input type="text" name="tag3"><br /> <br />

    <input type="submit" value="Upload" id="btnSubmit"> Press here to upload the file!
</form>
<span id="result"></span>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="<@spring.url '/js/materialize.min.js'/>"></script>
<script type="text/javascript" src="<@spring.url '/js/jquery.validate.js'/>"></script>
<script>$('.button-collapse').sideNav({
            menuWidth: 300, // Default is 300
            edge: 'right', // Choose the horizontal origin
            closeOnClick: true, // Closes side-nav on <a> clicks, useful for Angular/Meteor
            draggable: true // Choose whether you can drag to open on touch screens
        }
);

var urlv = "/s3/upload"; // the script where you handle the form input.

$(document).ready(function () {

    $("#btnSubmit").click(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        // Get form
        var form = $('#upform')[0];

        // Create an FormData object
        var data = new FormData(form);

        // If you want to add an extra field for the FormData
        data.append("CustomField", "This is some extra data, testing");

        // disabled the submit button
        $("#upform").prop("disabled", true);

        $.ajax({
            type: "POST",
            enctype: 'multipart/form-data',
            url: "/category/add",
            data: data,
            processData: false,
            contentType: false,
            cache: false,
            timeout: 600000,
            success: function (data) {

                $("#result").text(data);
                console.log("SUCCESS : ", data);
                $("#btnSubmit").prop("disabled", false);

            },
            error: function (e) {

                $("#result").text(e.responseText);
                console.log("ERROR : ", e);
                $("#btnSubmit").prop("disabled", false);

            }
        });

    });

});

</script>

</body>
</html>