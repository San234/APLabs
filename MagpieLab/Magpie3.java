
public class Magpie3
{
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "I want to") >= 0)
		{
			response = transformIWantToStatement(statement);
		}
		else if(findKeyword(statement, "me", statement.indexOf("you")) >= 0){
			response = transformYouMeStatement(statement);
			}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		/* place code for pet keywords here */

		/* place code for keyword "Robinette" here */


		else if (statement.trim().length() == 0)
		{
			response = "Say something, please.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private String transformIWantToStatement(String statement)
	{
		/**
		* trim the statement
		* variable lastChar = last character in statement
		* if lastChar is a period...
	    *        remove the last character from statement
	    *
	    * Set new int psn to the result from...
	    *        findKeyword() method @param statement, goal is "I want to "
	    * Set new String restOfStatement to the rest of statement after the
	    * "I want to ".
	    * /
	    * return "What would it mean to" + restOfStatement; **/
		
		statement = statement.trim();
		String lastChar = statement.substring(statement.length()-1);
		if(lastChar.equals(".")){
			statement = statement.replace(lastChar, " ");
			String goal = "I want to";
			String restOfStatement = statement.substring(goal.length());
		
			return "What would it mean to" + restOfStatement;
		}
		else{
			String goal = "I want to";
			String restOfStatement = statement.substring(goal.length());
		
			return "What would it mean to" + restOfStatement;
		}
	}

	 /**
	* Take a statement with "you <something> me" and transform it into
	* "What makes you think that I <something> you?"
	* @param statement the user statement, assumed to contain "you" followed by "me"
	* @return the transformed statement
	*/
	private String transformYouMeStatement(String statement)
	{
		/**
	    * trim the statement
	    * Set new String lastChar to the last character in statement
	    * if lastChar is a period...
	    *        remove the period
	    *
	    * Set new int psnOfYou to the result of findKeyword
	    *        @param statement and "you"
	    * Set new int psnOfMe to the result of findKeyword
	    *      @param statement, "me", and psnOfYou + 3
	    * Set new String restOfStatement to the rest of statement after "You" + 3,
	    * and before "me".
	    *
	    * return "What makes you think that I" + restOfStatement + "you?"
	    * */
		statement = statement.trim();
		String lastChar = statement.substring(statement.length());
		if(lastChar.equals(".")){
			statement = statement.replace(lastChar, " ");
			int psnOfYou = findKeyword(statement, "you");
			int psnOfMe = findKeyword(statement, "me",psnOfYou + 3);
			String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
			
			return "What makes you think that I " + restOfStatement + "you?";
		}
		else{
			int psnOfYou = findKeyword(statement, "you");
			int psnOfMe = findKeyword(statement, "me",psnOfYou + 3);
			String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe);
			
			return "What makes you think that I " + restOfStatement + "you?";
			
		}
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
		{

			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(),
										psn + goal.length() + 1);
			}

			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1);
		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}

}
