
		package java_2;
		class speed
		{
			String speed;
		}
		class SpeedImplementation
		{
			public String setSpeed(speed s, int spd)
			{
				if(spd<30 || spd>90)

			{
				try
				{
					throw new SpeedInvalidException("SpeedInvalidException");
				}
				catch(SpeedInvalidException ex)
				{
					s.speed = ex.getMessage();
				}
			}
			else
			{
				s.speed="Valid Speed";
			}
			return s.speed;
		}
		}
		class SpeedInvalidException extends Exception
		{
			private String msg;
			public SpeedInvalidException()
			{
				msg="invalid";
			}
			public SpeedInvalidException(String msg)
			{
				this.msg=msg;
			}
			public String getMessage()
			{
				return msg;
			}
			public String toString()
			{
				return "java.lang.SpeedInvalidException:"+msg;
			}
		}
		class Source
		{
			public static void main(String[] args){
				SpeedImplementation si = new SpeedImplementation();
				speed s= new speed();
				si.setSpeed(s, 20);
				System.out.println(s.speed);	
		}
		}

	}

}
