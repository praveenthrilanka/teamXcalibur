<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Document"%>
<%@page import="org.sampath.filex.web.actions.OtherDocuments"%>
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<style>
a{
    color: white;
 }

a:link{
    color:white; 
}

a:hover{
    color: black;
}


</style>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
        
        <div class="clearfix"></div>
        <div class="col-lg-12">
            <section class="box ">
                <header class="panel_header">
                    <h2 class="title pull-left">View Documents</h2>
                </header>
                <div class="content-body">    
                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="row">
                                <div class="col-md-2 col-sm-2 col-xs-2"></div>

                                <div class="col-md-2 col-sm-2 col-xs-2"></div>
                            </div>
                            <br/>
                            <div class="row">
                                
                                
                                
                                
                                <%
                                
                                                ArrayList<Document> dd = Document.getDocumentType();
                                                String arr1[] = {"ultra-widget ultra-todo-task bg-primary", "ultra-widget ultra-todo-task bg-orange", "ultra-widget ultra-todo-task bg-purple"};
                                                //String prefList = s.getCompanies();
                                                //ArrayList<Company> list = CompanyDA.getCompany(s.getField()) ; 
                                                int num = dd.size();
                                                if(num==0){
                                                    out.print("Sorry. No Document types  available.!");
                                                }
                                                else{
                                                   

                                           
                             %> 
                             
                             <%
                                Document doc;
                                int c = 0;
                                for (int x = 0; x < dd.size(); x++) {
                                 c = c % 3;
                                doc = dd.get(x);
                             %>
                             
                             
                             
                              

                                <div class="col-lg-4 col-md-6 col-xs-12 col-sm-6">

                                    <div class="<% out.print(arr1[c]); %>">
                                        <div class="wid-task-header">
                                            <div class="wid-icon">
                                                <i class="fa fa-tasks"></i>
                                            </div>
                                            <div class="wid-text">
                                                <h4><%=dd.get(x).getDoctype() %></h4>
                                                
                                                
                                                
                                                
                                               
                                            </div>
                                        </div>
                                        <div class="wid-all-tasks">
                                            <br/>
                                            <ul class="list-unstyled ps-container">

                                                
                                                    
                                                    <%
                                
                                                ArrayList<OtherDocuments> od = OtherDocuments.getDocuments(dd.get(x).getDoctypeid() , (String) session.getAttribute("pno"));
                                                //String prefList = s.getCompanies();
                                                //ArrayList<Company> list = CompanyDA.getCompany(s.getField()) ; 
                                                int siz = od.size();
                                                if(siz==0){
                                                    out.print("Sorry. No Document available.!");
                                                }
                                                else{
                                                   

                                           
                                             %>
                                             
                                             <%
                                                OtherDocuments otherdoc;
                                                 for (int y = 0; y < od.size(); y++) {
                                                 otherdoc = od.get(y);
                                                 %>
                                             
                                                 <li style = "font-size: 12pt"><a href = "../ViewOtherDocuments?docno=<% out.print(otherdoc.getDocno()); %>"><%=od.get(y).getDocName() %></a></li>
                                                
                                                <%
                                                
                                                    }                                                
                                                %>
                                                
                                                <%
                                                    }
                                                %>
                                                  
                                                <div class="ps-scrollbar-x-rail" style="left: 0px; bottom: 3px;"><div class="ps-scrollbar-x" style="left: 0px; width: 0px;"></div></div><div class="ps-scrollbar-y-rail" style="top: 0px; right: 3px;"><div class="ps-scrollbar-y" style="top: 0px; height: 0px;"></div></div></ul>

                                        </div>

                                    </div>
                                                 
                                                 

                                </div>
                                                
                                                <%
                                    
                                                   c++;     }
                                                 %>

                            </div>  
                                                 <%
                                    
                                                        }

                                                 %>
                                                    
                                                 

                        </div>


                    </div>
                </div>
        </div>
    </section></div>
</section></section>

<!-- END CONTENT -->



<%@ include file="Down.jsp" %>
