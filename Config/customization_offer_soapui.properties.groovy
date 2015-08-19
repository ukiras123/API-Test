
active_env = "CI" 

env_config {
	  host = "ebsqa-scan.grc-network.net"
	  port = "1521"
	  user = "SETUPSNAPSHOT"
	  password = "APPTA7gSap"
	  service_name = "appdbtst1"
}

http_auth{
		username = "rnalluri"
		password = "Welcome1"
}

endpoints{
		QA {
			endpoint = "http://10.92.41.174:8380"
		}
		
		CI {
			endpoint = "http://csapi-customizationoffer-ci.cloudhub.io"			
		   }
}
environments {
   QA {
	   Setup{
			env_config {
			  Sudhamma = "Gayatri Vedala"
			  Akhil = "Akhil Sai Krishna Vedala"	
			  host = "ebsqa-scan.grc-network.net"
			  port = "1521"
			  user = "setup"
			  password = "APPTwe25yZ"
			  service_name = "s_appdbtst"	  
			}
		}
		Setup_SnapShot{
			env_config {
			  host = "ebsqa-scan.grc-network.net"
			  port = "1521"
			  user = "SETUPSNAPSHOT"
			  password = "APPTA7gSap"
			  service_name = "s_appdbtst"	  
			}
		}
		env_config {
			  host = "ebsqa-scan.grc-network.net"
			  port = "1521"
			  user = "SETUPSNAPSHOT"
			  password = "APPTA7gSap"
			  service_name = "s_appdbtst"	  
		}
  }
  
  CI {
	   Setup{
			env_config {
			  host = "guthsc9sl11.grc-network.net"
			  port = "1521"
			  user = "SETUP"
			  password = "APPCAr35ex"
			  service_name = "appdbci"	  
			}
		}
		Setup_SnapShot{
			env_config {
			  host = "guthsc9sl11.grc-network.net"
			  port = "1521"
			  user = "SETUPSNAPSHOT"
			  password = "APPCSun445"
			  service_name = "appdbci"	  
			}
		}
		Base{
			env_config {
			  host = "guthsc9sl11.grc-network.net"
			  port = "1521"
			  user = "SetupCIbase"
			  password = "APPC53Bqwz"
			  service_name = "appdbci"	  
			}
		}
		
		Procs{
			env_config {
			  host = "guthsc9sl11.grc-network.net"
			  port = "1521"
			  user = "setupciprocs"
			  password = "APPC9qscvB"
			  service_name = "appdbci"	  
			}
		}
		
  }
  
  development {
    env_config {
      host = "ebsqa-scan.grc-network.net"
	  port = "1521"
	  user = "SETUPSNAPSHOT"
	  password = "APPTA7gSap"
	  service_name = "s_appdbtst"	  
    }
  }

  test {
    env_config {
      host = "ebsqa-scan.grc-network.net"
	  port = "1521"
	  user = "SETUPSNAPSHOT"
	  password = "APPTA7gSap"
	  service_name = "s_appdbtst"
    }
  }
}