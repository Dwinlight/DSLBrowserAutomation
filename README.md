# DSLBrowserAutomation
Creation of a DSL for browser automation

Functions of our DSL : 
- ON  <b>browser</b> : open a window in the browser <b> browser </b> 
- GOTO <URL> : open the window at the url <b> URL </b>
 - IS <b>component</b> : returns a boolean. True if <b>component</b> is found on the page. False otherwise.
 - WHERE ATTRIBUT <b> a </B> :  search on the attribute <b>a</b>
 - WHERE CONTENT <b> c </B> :  search on the content ( inside the tags)  <b>c</b>
 -CLICK <b>c</b> :  click on the component <b>c</b>
 - SET ATTRIBUT <b> (a,v)</b> : set the the attribut <b>a</b> at the value <b>v</b> 
 - EQUALS : verify the strict equality  of two attributes/contents 
 - CONTAINS <b>s</b> :  verify that an attribute/content contains the string <b>s</b>
 - Print <b>v</b> : print the variable <b>v</b> 
  
  
