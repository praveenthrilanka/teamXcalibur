<%@ include file="Up.jsp" %>
<%@ include file="Clear_Sidebar.jsp" %>
                    
            <!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
				<div class="login-form" style ="">
					<h4>Edit Your Profile</h4>
					<h5><strong></strong></h5>


                                        <form name="EditProfile" method="post" action="../SetIcon" enctype="multipart/form-data">
						<div style="display:block; margin:auto; width:30%;">
							<img style="border-radius: 50%;" src="logos/user.png" id="output" width="130" height="130"/>
						</div>
						<br/>
						<div style="display:block; margin:auto; width:45%;">
							<input type="file" name="logo" accept="image/*"  onchange="loadFile(event)"/>
							
						</div>
						
					    <br/><br/>
                                            
                                            <input type="checkbox" name="propicchk" value="Change the pic">Change the profile picture
                                            <input type="checkbox" name="pwchk" value="Change the passsword">Change the password
                                            <input type="checkbox" name="emailchk" value="Change the email">Change the email<br/><br/>
                                            
                                            <label>Password :</label>


                                            <input type="password" id=oldpassword" name="pw" placeholder="Enter the old password" required="">				<br/><br/><br/>
                                            <input type="password" id=newpassword" name="npw" placeholder="Enter the new password">				<br/><br/><br/>
                                            <input type="password" id=cnewpassword" name="cnpw" placeholder="Confirm the new password">				<br/><br/><br/>

                                            


                                            <label>Email :</label>
                                            <input type="text" id="newname" name="email" placeholder="Enter email address">				<br/><br/><br/>

                                            
                                            

                                            
						<div class="clearfix"></div>
                                                
						<input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Set">
						<input style="background-color:FFC682; border:none;" class="btn btn-info btn-block" type="reset" id="reset">
						<br/>
					</form>
				</div>
			
                                            
                        <script>
						  var loadFile = function(event) {
						    var output = document.getElementById('output');
						    output.src = URL.createObjectURL(event.target.files[0]);
						  };
			</script>
                </section></section>

<%@ include file="Down.jsp" %>