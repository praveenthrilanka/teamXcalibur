<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Document"%>
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar_Project.jsp" %>

<!-- CORE CSS FRAMEWORK - START -->
        <link href="plugins/pace/pace-theme-flash.css" rel="stylesheet" type="text/css" media="screen"/>
        <link href="plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="fonts/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/animate.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS FRAMEWORK - END -->

      
<!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
		<div class="login-form" style ="">
                    <h4>Upload Documents</h4>

                        <form name="AddOtherDocument" method="post" action="../UploadOtherDocument" enctype="multipart/form-data">

                        
                                            
                             <%
                                
                                                ArrayList<Document> dd = Document.getDocumentType();
                                                //String prefList = s.getCompanies();
                                                //ArrayList<Company> list = CompanyDA.getCompany(s.getField()) ; 
                                                int num = dd.size();
                                                if(num==0){
                                                    out.print("Sorry. No Document types  available.!");
                                                }
                                                else{
                                                   

                                           
                             %>  
                             
                            <select name="<%="doctype" %>">  
                            <option value = "" selected ="true" disabled = "disabled"> Select Document Type</option>
                            
                            <%
                                
                               for(int j=0;j<num;j++){

                            %>
                            
                            <option value =<%=dd.get(j). getDoctypeid() %> ><%=dd.get(j).getDoctype() %> </option>
                            <%
                                    
                                }
                            %>
                            
                            
                            
                            </select>
                            
                            <%
                                                   
                                 }
                             %>
                           
                            
                            
                                </br></br>    
                                <div style="display:block; margin:auto; width:30%;">
							<img src="images/upload.png" id="output" width="130" height="130"/>
						</div>
						<br/>
						<div style="display:block; margin:auto; width:45%;">
                                                <input type="file" name="otherFile" accept=".pdf , .docx " onchange="loadFile(event)" required/>
							
						</div>
					
                                                <br/>
                                                
                                                
				 <label><b>Narration :</b></label>
                                <input type="text" name="narration" placeholder="Enter a name for the document " required> <br/></br>		
                                                
                                <div class="clearfix"></div>                                      
                                <input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Upload Document">
                                
                                </form>
                             
                                <!--To add a new document -->
                                <form name="addnewform" action="../AddNewDoc" method="post">
                                                
                                                <div class="clearfix"></div>
                                                <button style="background-color:#02a7e7;  border:none;" class="btn btn-info btn-block " id="button1" type = "button" onclick="showDiv()">Add a New Document Type</button>
                                                
           
                                                <!-- Display only if user wants to add a new document type -->
                                               
                                                <div id="div_ctrl" style="display:none">
                                                </br>
                                                <div id="addnew">
                                                    <label>Enter Document Type:</label> 
                                                    <input type="text" name="docname" placeholder="Name of the Document.." />
                                                </div> <br /> 
                                                    
                                                <input  type="submit" value="ADD" onclick=" return isEmpty()"> <br /><br/>
                                                </div>
                                                
                                                
                                                <div id="success" style="display: none">
                                                    <div>Document Type Saved successfully ! </div>
                                                 </div>
                                        </form>     

                                        </div>
                                
                                           
                                            <script>
                                                    function showDiv(){  //  display the input field to add new document
                                                        document.getElementById('div_ctrl').style.display = 'block' ;  
                                                        
                                                    }
                              
                                            </script>  
                                            
                                            <script>
                                                 function showDiv2(){
                                                     document.getElementById('success').style.display = 'block';
                                                 }
                                                </script>
                                            
                                            <script>
                                                function isEmpty(){  // input field validation
                                                    var empty = document.forms["addnewform"]["docname"].value;
                                                    if (empty === "" ){
                                                        alert("Please Enter a Document type !");
                                                        return false;
                                                        
                                                    }else{
                                                        showDiv2();
                                                    }
                                                    
                                                    }   
                                                
                                            </script>
                                            
                                            
                                <script>
						  var loadFile = function(event) {
						    var output = document.getElementById('output');
						    output.src = URL.createObjectURL(event.target.files[0]);
						  };
                                </script>
                </section></section>>

<%@ include file="Down.jsp" %>