
public class studentPojo
	    {
	  private String name;
	  private String last;
	  private double gpa;
	  private String periodOne;
	  private String gradeOne;
	  private String periodTwo;
	  private String gradeTwo;
	  private String periodThree;
	  private String gradeThree;
	  
	  public studentPojo (String n, String l, double g, String pO, String gO, String pT, String gT, String pTr, String gTr)
	    {
	    name = n;
	    last = l;
	    gpa = g; 
	    periodOne = pO;
	    gradeOne = gO;
	    periodTwo = pT;
	    gradeTwo = gT;
	    periodThree = pTr;
	    gradeThree = gTr;
	    
	    }

	public String getName()
		{
			return name;
		}

	public void setName(String name)
		{
			this.name = name;
		}

	public String getLast()
		{
			return last;
		}

	public void setLast(String last)
		{
			this.last = last;
		}

	public double getGpa()
		{
			return gpa;
		}

	public void setGpa(double gpa)
		{
			this.gpa = gpa;
		}

	public String getPeriodOne()
		{
			return periodOne;
		}

	public void setPeriodOne(String periodOne)
		{
			this.periodOne = periodOne;
		}

	public String getGradeOne()
		{
			return gradeOne;
		}

	public void setGradeOne(String gradeOne)
		{
			this.gradeOne = gradeOne;
		}

	public String getPeriodTwo()
		{
			return periodTwo;
		}

	public void setPeriodTwo(String periodTwo)
		{
			this.periodTwo = periodTwo;
		}

	public String getGradeTwo()
		{
			return gradeTwo;
		}

	public void setGradeTwo(String gradeTwo)
		{
			this.gradeTwo = gradeTwo;
		}

	public String getPeriodThree()
		{
			return periodThree;
		}

	public void setPeriodThree(String periodThree)
		{
			this.periodThree = periodThree;
		}

	public String getGradeThree()
		{
			return gradeThree;
		}

	public void setGradeThree(String gradeThree)
		{
			this.gradeThree = gradeThree;
		}
	   }