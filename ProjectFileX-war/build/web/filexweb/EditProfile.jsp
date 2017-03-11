<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>



<!-- START CONTENT -->
<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
   
     <style>  
            #dialogoverlay{

                display: none;

                opacity: .8;

                position: fixed;

                top: 0px;

                left: 0px;

                background: #FFF;

                width: 100%;

                z-index: 10;

            }


            #dialogbox{


                display: none;

                position: fixed;

                background: #000;

                border-radius:4px; 

                width:550px;

                z-index: 10;

            }

            #dialogbox > div{background:#FFF; margin:1px;}

            #dialogbox >div > #dialogboxhead{
                background: #fcfcfc; 
                font-size:19px;
                padding:10px; 
                color:#000000;
            }

            #dialogbox > div > #dialogboxbody{ 
                background:#ececec; 
                padding:20px; 
                color:#000000; 

            }
            #dialogbox > div >#dialogboxfoot{
                background: #fcfcfc;
                padding:10px; 
                text-align:right; 


            }

            label{

                color:#00000;
                font:normal 14px Tahoma !important;
               


            }    






    </style>


        <div class="login-form" style ="">
            <h4>Edit Your Profile</h4>
            <h5><strong></strong></h5>


            <form name="EditProfile" method="post" action="../SetIcon" enctype="multipart/form-data" onsubmit="return Validate();">
                <label ><b>Enter your password :</b></label><br/>

                <input type="password" id=oldpassword" name="pw" placeholder="Enter the old password" required="">		<br/><br/>		

                <input type="checkbox" name="propicchk" id="propiccheck" value="Change the profile picture" onclick="disablePassword()"/><b>Change the profile picture</b><br/><br/>
                <div style="display:block; margin:auto; width:30%;">
                    <img style="border-radius: 50%;" src="logos/user.png" id="output" width="130" height="130"/>
                </div>
                <br/>
                <div style="display:block; margin:auto; width:45%;">
                    <input type="file" name="logo" id="piclogo" accept="image/*"  onchange="loadFile(event)" disabled=""/>

                </div>



                <br/><br/><br/>

                <input type="checkbox" name="pwchk" id="passcheck" value="Change the passsword" onclick="disablePassword()" /><b>Change the password</b><br/><br/>


                <input type="password" id="newpassword" name="npw" placeholder="Enter the new password" disabled="" >				<br/><br/><br/>
                <input type="password" id="cnewpassword" name="cnpw" placeholder="Confirm the new password" disabled="">				<br/><br/>


                <br/><br/>

                <input type="checkbox" name="emailchk" id="emailcheck" value="Change the email" onclick="disablePassword()"><b>Change the email</b><br/><br/>


                <input type="text" id="newmail" name="email" placeholder="Enter email address here" disabled="">				<br/><br/><br/>





                <div class="clearfix"></div>

                <input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Set" />
                <input style="background-color:FFC682; border:none;" class="btn btn-info btn-block" type="reset" id="reset" >
                <br/>
            </form>
        </div>
        <div id="dialogoverlay"></div>

        <div id="dialogbox">

            <div>

                <div id="dialogboxhead"></div>

                <div id="dialogboxbody"></div>

                <div id="dialogboxfoot"></div>

            </div>

        </div>



        <script type="text/javascript">
            
            
            var loadFile = function (event)
            {
                var output = document.getElementById('output');
                output.src = URL.createObjectURL(event.target.files[0]);
            };

            function disablePassword()
            {
                
                if (document.getElementById('passcheck').checked === true)
                {
                    document.getElementById("newpassword").disabled = false;
                    document.getElementById("cnewpassword").disabled = false;
                } else
                {
                    document.getElementById("newpassword").disabled = true;
                    document.getElementById("cnewpassword").disabled = true;
                }
                
                if (document.getElementById('emailcheck').checked === true)
                {
                    document.getElementById("newmail").disabled = false;

                    
                } else 
                {
                    document.getElementById("newmail").disabled = true;

                }
                
                 if (document.getElementById('propiccheck').checked === true)
                {
                    document.getElementById("piclogo").disabled = false;

                    
                } else 
                {
                    document.getElementById("piclogo").disabled = true;

                }


            }

            function Validate()
            {
                if (document.getElementById("passcheck").checked == true && document.getElementById("emailcheck").checked == false && document.getElementById("propiccheck").checked == false) {

                    if ((document.EditProfile.npw.value != "" && document.EditProfile.cnpw.value != "") && (document.EditProfile.npw.value != document.EditProfile.cnpw.value)) {

                        Alert.render("Passswords do not match!");
                        document.EditProfile.cnpw.focus();

                        return false;
                    }

                    if (document.EditProfile.npw.value == "" && document.EditProfile.cnpw.value != "") {

                        Alert.render("Enter the new password first!");
                        document.EditProfile.cnpw.focus();

                        return false;
                    }
                    if (document.EditProfile.npw.value != "" && document.EditProfile.cnpw.value == "") {

                        Alert.render("Confirm your password!");
                        document.EditProfile.cnpw.focus();

                        return false;
                    }
                    if (document.EditProfile.npw.value == "" && document.EditProfile.cnpw.value == "") {

                        Alert.render("Fill out the password fields!");
                        document.EditProfile.cnpw.focus();

                        return false;
                    }


                    document.EditProfile.submit();
                }

            }

            function CustomAlert() 
            {

                this.render = function (dialog)
                {

                    var winW = window.innerWidth;

                    var winH = window.innerHeight;

                    var dialogoverlay = document.getElementById('dialogoverlay');

                    var dialogbox = document.getElementById('dialogbox');


                    dialogoverlay.style.display = "block";

                    dialogoverlay.style.height = winH + "px";

                    dialogbox.style.left = (winW / 2) - (550 * .5) + "px";

                    dialogbox.style.top = "100px";

                    dialogbox.style.display = "block";


                    document.getElementById('dialogboxhead').innerHTML = "OOPS..! Something went wrong..";

                    document.getElementById('dialogboxbody').innerHTML = dialog;

                    document.getElementById('dialogboxfoot').innerHTML = '<button class="btn btn-success" onclick="Alert.ok()">OK</button>';

                }

                this.ok = function ()
                {

                    document.getElementById('dialogbox').style.display = "none";

                    document.getElementById('dialogoverlay').style.display = "none";

                }

            }

            var Alert = new CustomAlert();


        </script>

    </section></section>

<%@ include file="Down.jsp" %>  