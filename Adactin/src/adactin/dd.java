package adactin;


	class Hospital {
		int variable1, variable2;
		double variable3;
		public Hospital(int doctors, int nurses) {
		 variable1 = doctors;
		 variable2 = nurses;
		}
		public Hospital(int doctors) {
		 variable1 = doctors;
		}
		public Hospital(double salaries) {
		 variable3 = salaries;
		}
		}

	class OverloadingHelp {
		   public int findarea (int l, int b) {
		           int var1;
		           var1 = l * b;
		           return var1;
		   }
		   public int findarea (int l, int b, int h) {
		           int var2;
		           var2 = l *b * h;
		           return var2;
		   }
		}