package es.unileon.prg.date;

public class Date {

		private int day, month, year;

		public Date(int day, int month, int year)throws DateException {
			
			
			StringBuffer message=new StringBuffer();
			
			if(month<1 || month>12){
				this.month=month;
			}
			else{
				throw new DateException("Mes incorrecto");
			}	
			if(day<1 || day>31){
				this.day=day;
			}
			else{
				throw new DateException("Dia incorrecto");
			}
			if(year>0){
				this.year=year;
			}
			else{
				throw new DateException("Anio incorrecto");
			}
			
		public int getDay() {
			return day;
		}
		}
		public void setDay(int day)throws DateException {
			StringBuffer message=new StringBuffer();
			
			if(day>this.getMonth() || day<1)
				message.append("Dia introducido incorrecto, no se puede modificar");
			
			if(message.length()>0){
				throw new DateException(message.toString());
				
			}else
			
				this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month)throws DateException {
			
			StringBuffer message=new StringBuffer();
			int diasMes=this.getMonth();
			
			
			if(month<1 || month>12)
				message.append("Dia introducido incorrecto, no se puede modificar");
			
			else if(day>diasMes)
				message.append("Este mes no tiene tantos dias, no se puede modificar");

			
			
			if(message.length()>0){
				throw new DateException(message.toString());
			}else{
			this.month = month;
			}
		}

		
		//no hace falta hacer nada, se puede modificar el anio
		
		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		
		
		
		
		
		boolean isSameYear(Date other){
			
			if(year==other.year)
				return true;
			else
				return false;
		}
		
		
		boolean isSameMonth(Date other){
			
			if(month==other.month)
				return true;
			else
				return false;
		}
		
		boolean isSameDay(Date other){
			
			if(day==other.day)
				return true;
			else
				return false;
		}
		
		
		boolean isSame(Date other){
			if(day==other.day && month==other.month && year==other.year)
				
				return true;
			else
				return false;
		}	
		public void diasFinMes(){
			int i=0;
			StringBuffer day=new StringBuffer();
			int numDays;
			
			while(i<=this.getMonth()){		
				day.append(i+"/"+this.month+"/"+this.year+"\n");
				i++;
			}
		}
			
		
		
		public void nombreMes(int month){
			
			switch(month){
			case 1:
				System.out.println("Enero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;		
			case 4:
				System.out.println("Abril");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
				
			case 2:
				System.out.println("Febrero");
				break;
				
			default:
				System.out.println("Error");;
			}
		}
		
		public void estacionMes(int month){
			switch(month){
			case 1:
				System.out.println("Invierno");
				break;
			case 2:
				System.out.println("Invierno");
				break;
			case 3:
				System.out.println("Invierno o primavera");
				break;
			case 4:
				System.out.println("Primavera");
				break;
			case 5:
				System.out.println("Primavera");
				break;
			case 6:
				System.out.println("Primavera o verano");
				break;
			case 7:
				System.out.println("Verano");
				break;
			case 8:
				System.out.println("Verano");
				break;
			case 9:
				System.out.println("Verano u otonio");
			case 10:
				System.out.println("Otonio");
				break;
			case 11:
				System.out.println("Otonio");
				break;
			case 12:
				System.out.println("Otonio o invierno");
				break;
				
				default:
					System.out.println("-1");
			}
		}
		
		public void monthsLeft(int month){
			
			switch(month){
			case 1:
				System.out.println("Febrero marzo abril mayo junio julio agosto septiembre octubre noviembre diciembre");
				break;
			case 2:
				System.out.println("marzo abril mayo junio julio agosto septiembre octubre noviembre diciembre");
				break;
			case 3:
				System.out.println("abril mayo junio julio agosto septiembre octubre noviembre diciembre");
				break;
			case 4:
				System.out.println("mayo junio julio agosto septiembre octubre noviembre diciembre");
				break;
			case 5:
				System.out.println("junio julio agosto septiembre octubre noviembre diciembre");
				break;
			case 6:
				System.out.println("julio agosto septiembre octubre noviembre diciembre");
				break;
			case 7:
				System.out.println("agosto septiembre octubre noviembre diciembre");
				break;
			case 8:
				System.out.println("septiembre octubre noviembre diciembre");
				break;
			case 9:
				System.out.println("octubre noviembre diciembre");
				break;
			case 10:
				System.out.println("noviembre diciembre");
				break;
			case 11:
				System.out.println("diciembre");
				break;
			case 12:
				System.out.println("No quedan meses");
				
				default: 
					System.out.println("-1");
				
			}
		}
		
		public void sameNumber(int month){
			
			switch (month){
		case 1:
			System.out.println("marzo mayo julio agosto octubre diciembre");
			break;
		case 2:
			System.out.println("febrero");
			break;
		case 3:
			System.out.println("enero mayo julio agosto octubre diciembre");
			
			break;
		case 4:
			System.out.println("junio septiembre noviembre");
			break;
		case 5:
			System.out.println("enero marzo julio agosto octubre diciembre");
			break;
		case 6:
			System.out.println("abril septiembre noviembre");
			break;
		case 7:
			System.out.println("enero marzo mayo agosto octubre diciembre");
			break;
		case 8:
			System.out.println("enero marzo mayo julio octubre diciembre");
			break;
		case 9:
			System.out.println("abril junio noviembre");
			break;
		case 10:
			System.out.println("enero marzo julio agosto diciembre");
			break;
		case 11:
			System.out.println("abril junio septiembre");
			break;
		case 12:
			System.out.println("enero marzo mayo julio agosto octubre");
			
			default: 
				System.out.println("-1");
			}	
			
			
		}

}		
		
		
		
		
		
		
		
		
		
}
