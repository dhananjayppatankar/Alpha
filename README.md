# Alpha
TElusko DEmo with Maven + DB connection
Notes : Lecture 1 : Introduction
Lecture 2 : Web Application Basics 
Lecture 3 : Servlet Creation  2 ways : 1. Web.xml 2.Annotation @Webservlets
Lecture 4: Assignment for servlets  -- random id 
		1. JSP - extension of Servlets... JSP convert to servlets when called 
		2. JSP Scriplets
				- Directive    <%    %>
				- Declarataive    <% !      %>
				- Scriplets <%  -----   %>


Lecture 5: Call servlets from another servlet 
		
		1- Create Request Dispatcher object -- request.getRequestDispatcher("File.jsp)  -- rd.forward(req,resp)
		2- Create Response SendRedirect -- response.sendRedirect 


Lecture 6: Session Object with :			
		
		1. URL reWirting - (without using session object)
			- str = request.getParameter in servlet 1
			- pass the str from the URL in response.sendRedirect("display?a = " + str)
			- create servlet 2 
			- create new request.getParameter() and print the str
		2. Cookies
		3.Session  - (with using session object)
		4. Form hiding
		
		
Lecture 7 : 

	-Servlet /fetchData
	-Entity class : User ( uid, uname, age) -- getter n setter --toString(Object print)
	-Assignment : -
	1- get Users   - return list of users 
	2. accept string  str
	3. get all name has this "Str"  
			
		
Lecture 11 :
  
   	-Filters :  Inteceptors ------      FLOW Client ---- Filters(Intercept the request) ----  Servlet ----- DB
  	- Filter Class implement Filter Interface 
	- doFilter method chain.filter(request, respomse)
	- make use of HTTPSERvlet request and response as there is request.getSession method available which comes handy.
		
