class Calculator{
	public static void main(String []args)
	{
		double num1,num2,num3;
		
		num1 = Double.parseDouble(args[0]);
		num2 = Double.parseDouble(args[2]);
		
		switch(args[1])
		{ case "+":
	        {
			    num3=num1+num2;
				System.out.println(num1 +"+"+num2 +"=" + num3);
				break;
			}
		  case "-":
		    {
				num3=num1-num2;
				System.out.println(num1 +"-"+num2 +"=" + num3);
				break;
			}
		  case "x":
		    {
				num3=num1*num2;
				System.out.println(num1 +"x"+num2 +"=" + num3);
				break;
			}
		  case "/":
		    {
				num3=num1*num2;
				System.out.println(num1 +"/"+num2 +"=" + num3);
				break;
			}
		   default:
		  {
		  	System.out.println("Please Enter a Valid Operation");
			break;
		  }
		}
	}
}