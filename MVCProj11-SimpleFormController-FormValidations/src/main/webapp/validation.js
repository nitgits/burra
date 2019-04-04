function validate(frm){
	frm.vflag.value="yes";
	document.getElementById("nameErr").innerHTML="";
	document.getElementById("addErr").innerHTML="";
	document.getElementById("numberErr").innerHTML="";
	document.getElementById("amtErr").innerHTML="";
	
	let name=frm.cname.value;
	alert(name);
	let add=frm.cadd.value;
	let number=frm.mobileno.value;
	let amt=frm.billamt.value;
	
	
	if(name==""){
		document.getElementById("nameErr").innerHTML="Name is mandatory";
		frm.cname.focus();
		return false;
	}
	
	 if(add==""){
		document.getElementById("addErr").innerHTML="Address is mandatory";
		frm.cadd.focus();
		return false;
	}
	 
	 if(number==""){
		 document.getElementById("numberErr").innerHTML="Mobile Number is mandatory";
		 frm.mobileno.focus();
		 return false;
	 }
	 else if(isNaN(number)){
		 document.getElementById("numberErr").innerHTML="Mobile Number must be digits";
		 frm.mobileno.focus();
		 return false;
	 }
	
	
	 if(amt==""){
		 document.getElementById("amtErr").innerHTML="Bill Amount is mandatory";
		 frm.billamt.focus();
		 return false;
	 }
	 else if(isNaN(amt)){
		 document.getElementById("amtErr").innerHTML="Bill Amount must be digits";
		 frm.billamt.focus();
		 return false;
	 }
	 return true;
}