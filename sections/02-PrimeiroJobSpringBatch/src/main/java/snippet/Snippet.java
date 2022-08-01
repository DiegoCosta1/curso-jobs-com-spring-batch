package snippet;

public class Snippet {
	var jq = document.createElement('script');
	jq.src = "https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js";
	document.getElementsByTagName('head')[0].appendChild(jq);
}

