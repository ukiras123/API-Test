
active_env = "CI" 

http_auth{
		username = "rnalluri"
		password = "Welcome1"
}

endpoints{
		QA {
			endpoint = "http://10.92.41.174:8380"
		}
		
		CI {
			endpoint = "https://csapi-segmentation-qa.cloudhub.io"			
		   }
}
