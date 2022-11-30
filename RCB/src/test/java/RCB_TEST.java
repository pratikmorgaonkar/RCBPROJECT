import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import jsonbody.body;

public class RCB_TEST 
{
	public JsonPath jp;
	@Test
	public void no_of_foreing_players()
	{
		int count=0;
		int wk=0;
		jp=new JsonPath(body.jsonbody());
		
		
		// FOR CHECKING WHETHER THE TEAM HAS EXACTLY 4 FOREING PLAYERS OR NOT
		
		System.out.println("------------------------1st Test----------------------------");
		int s=jp.getInt("player.size()");
		
		for(int i=0;i<s;i++)
		{
	
			if(!jp.get("player["+i+"].country").equals("India"))
					{
					System.out.println(jp.get("player["+i+"].country"));
					count++;
					}
				
		}
		if(count==4)
		{
			System.out.println("TEAM HAS ONLY 4 FOREIGN PLAYERS");
		}
		
		else
		{
			System.out.println("The no of foreign players are "+ count );
		}
		
		System.out.println("------------------------2nd Test----------------------------");
		// FOR CHECKING WHETHER THERE IS AT LEAST ONE WICKET KEEPER OR NOT
		
		for(int i=0;i<s;i++)
		{
			if(jp.get("player["+i+"].role").equals("Wicket-keeper"));
			wk++;
		}
		
		if(wk>=1)
		{
			System.out.println("AT LEAST 1 WICKET KEEPER IS THERE");
		}
		else
		{
			System.out.println("no of wicket keeper is " + wk);
		}
		
		
		
		
		
	}
	
	
	

	
	
	

}
