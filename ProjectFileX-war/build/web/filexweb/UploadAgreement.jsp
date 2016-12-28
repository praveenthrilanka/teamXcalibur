<%@ include file="Up.jsp" %>
<%@ include file="BA_Sidebar_Project.jsp" %>
                    
            <!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
		<div class="login-form" style ="">
                    <h4>Upload Agreement</h4>

                        <form name="EditProfile" method="post" action="../UploadAgreement" enctype="multipart/form-data">

                        <label>Agreement ID:</label>
                            <input type="text" name="agreementid" placeholder="Enter Agreement ID" required> <br/><br/>
                                            
                                <br/><br/><br/>
                                    <div style="display:block; margin:auto; width:30%;">
							<img src="images/upload.png" id="output" width="130" height="130"/>
						</div>
						<br/>
						<div style="display:block; margin:auto; width:45%;">
							<input type="file" name="srs"  onchange="loadFile(event)" required/>
							
						</div>
						
					    <br/><br/><br/>

						<div class="clearfix"></div>
                            <input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Upload Agreement">
                        </form>

                </div>
			
                                            
                        <script>
						  var loadFile = function(event) {
						    var output = document.getElementById('output');
						    output.src = URL.createObjectURL(event.target.files[0]);
						  };
			</script>
                </section></section>>

<%@ include file="Down.jsp" %>