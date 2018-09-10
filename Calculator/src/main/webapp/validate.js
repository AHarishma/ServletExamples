function add(type) {
	if (document.forms[0]["operation"].value == "Subtraction" ||document.forms[0]["operation"].value == "Division")
		document.getElementById("button").disabled = true;
	// Create an input type dynamically.
	var element = document.createElement("input");
	// Assign different attributes to the element.
	element.setAttribute("type", "number");
	element.setAttribute("value", "input");
	element.setAttribute("name", "input");
  //element.setAttribute("required", "");

	var foo = document.getElementById("spanId");

	// Append the element in page (in span).
	foo.appendChild(element);

}


//This function here is only a cross-browser events stopper
stopEvent = function(ffevent)
{
//  var current_window = window;

//   if(current_window.event) //window.event is IE, ffevent is FF
//   {
//      //IE
//      current_window.event.cancelBubble = true; //this stops event propagation
//      current_window.event.returnValue = false; //this prevents default (usually is what we want)
//   }
//   else
//   {
      //Firefox
      ffevent.stopPropagation();
      ffevent.preventDefault();
  // };
}

function validateAllInputBoxes(ffevent)
{
   var inputs = document.getElementsByTagName('input');
   for(var i = 0; i < inputs.length; ++i)
      if(inputs[i].type === 'number')
         if(inputs[i].value === ''||isNaN(inputs[i].value)) 
         {
            alert("form could not be sent as input text field is empty");
            stopEvent(ffevent);
         }
}




//while (it.hasNext()) {
//Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();
//String paramName = entry.getKey();
//String[] paramValues = entry.getValue();
//if (paramName.equals("input"))
//	for (int i = 0; i < paramValues.length; i++) {
//		arrayList.add(Integer.parseInt(paramValues[i]));
//	}
//}