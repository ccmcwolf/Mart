/**
 * Created by Chamith on 16/09/2017.
 */
function formOnSubmit() {
    var formData = $('#savedeliveryinfo').serialize();
    $.ajax({
        type: "GET",
        url: '/order/updateorder',
        data: formData ,
        enctype: 'multipart/form-data',
        contentType: false,
        cache: false,
        timeout: 600000,
        success: function(data){
            alert("success"+data);
        },
        error: function(data){
            alert("error"+data);

        },
    });
}



