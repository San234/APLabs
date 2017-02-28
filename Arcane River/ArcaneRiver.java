import java.util.Scanner;
import java.util.Random;

public class ArcaneRiver
{	
	static int max_hp;
	static int hp;
	static int max_mp;
	static int mp;
	static int atk;
	static int s_atk;
	static int def;
	static int item;
	static int h_item;
	static int m_item;
	static int level;
	static int exp;
	static int max_exp;
	static int gold;
	static int skill;
	static int ErhdasEnc;
	static int PsyOrPhy;
	static int mon_s_atk;
	static String name;
	static Random rand = new Random();
	static Scanner up = new Scanner(System.in);
	
	public static void start()
	{
		ArcaneRiver go = new ArcaneRiver();
		
		System.out.print("Enter your nickname :\n");
		String user_name = up.nextLine();
		
		name = user_name;
		hp = rand.nextInt(75) + 180;
		max_hp = hp;
		mp = rand.nextInt(50) + 100;
		max_mp = mp;
		atk = rand.nextInt(20) + 100;
		s_atk = rand.nextInt(40) + 70;
		def = rand.nextInt(30) + 50;
		exp = exp;
		max_exp = 200;
		gold = 200;
		item = 0;
		level = 5;
		h_item = 0;
		m_item = 0;
		for(int i = 0; user_name.length() < 38; i++){
			user_name = ("-" + user_name + "-");
			if(user_name.length() % 2 == 1 && user_name.length() == 37){
				user_name = ("-" + user_name);
			}
		}
		if(user_name.length() > 38){
			System.out.println("!!Too long!!");
			System.out.println("Try Again...");
			start();
		}
		System.out.println("!!!Welcome to \"The Arcane River\"!!!");
		stat(user_name);
	}
	public static void stat(String user_name)
	{
		String placeName = "";
		
		while(exp >= max_exp){
			atk += 20;
			def += 20;
			s_atk += 8;
			max_hp += 50;
			hp =max_hp;
			max_mp += 30;
			mp = max_mp;
			level += 1;
			exp -= max_exp;
			max_exp = max_exp +90;
		}
		if(level % 8 == 0){
			skill += 1;
			System.out.print("!!You learned \"Fireball\"!!\n");
		}
		
		if(level <= 10){
			ErhdasEnc = rand.nextInt(3)+1;
			placeName = "lake of oblivion";
		}
		else if(level > 10&&level < 18){
			ErhdasEnc = rand.nextInt(2)+5;
			placeName = "the cave of peace";
		}
		else if(level >= 18&&level < 20){
			ErhdasEnc = rand.nextInt(2) + 6;
		}
		else if(level > 10||level < 18){
			ErhdasEnc = rand.nextInt(2)+5;
			placeName = "the cave of peace";
		}
		else if(level >= 18&&level < 20){
			ErhdasEnc = rand.nextInt(2) + 6;
			placeName = "volcanic mountain";
		}
		
		
		System.out.printf("You are in \"%S\"\n",placeName);
		System.out.printf("%2S\n", user_name);
		System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "hp", hp, max_hp,"atk", atk);
		System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "mp", mp, max_mp,"def", def);
		System.out.printf("|%8S = %5s%8S : %3s/%5s|\n", "s_atk", s_atk, "exp", exp,max_exp);
		System.out.printf("|%8S : %5s%8S : %9s|\n","Level" , level, "Gold" , gold);			
		System.out.print("What would you do? [Hunt Shop Item]\n");
		String act_ask = up.nextLine();
		
		if(act_ask.equals("hunt") || act_ask.equals("Hunt"))
		{
			if(level % 10 == 0){
				ErhdasEnc = 4;
				System.out.println("!!!WARNING!!!");
				bosshunt(user_name, ErhdasEnc);
			}
			
			if (ErhdasEnc == 1){
				hunt1(user_name, ErhdasEnc);
			}
			else if(ErhdasEnc == 2){
				hunt2(user_name, ErhdasEnc);
			}
			else if(ErhdasEnc == 3){
				hunt3(user_name, ErhdasEnc);
			}
			else if(ErhdasEnc == 5){
				hunt5(user_name, ErhdasEnc);
			}
			else if(ErhdasEnc == 6){
				hunt6(user_name, ErhdasEnc);
			}
			else if(ErhdasEnc == 7){
				hunt7(user_name, ErhdasEnc);
			}
		}
		if(act_ask.equals("Shop")||act_ask.equals("shop")){
			shop(user_name, ErhdasEnc);
		}
		else if(act_ask.equals("Item")||act_ask.equals("item")){
			useItemLobby(user_name);
		}
		else
		{
			System.out.println("Wrong!");
			stat(user_name);
		}
	}
	public static void shop(String user_name, int ErhdasEnc)
	{
		System.out.println("You have " + gold + "G and ");
		if(item == 0){
			System.out.print("You have no items\n");
		}
		else if(item ==1){
			System.out.print("You have 1 item\n");
		}
		else{
			System.out.print("You have " + item + " items\n");
		}
		System.out.print("Would you buy?\n");
		String shop_ask = up.nextLine();
		
		if(shop_ask.equals("y")||shop_ask.equals("yes")){
			System.out.print("What would you buy? [HP MP]\n");
			String choose_item = up.nextLine();
			
			if(choose_item.equals("hp")||choose_item.equals("HP")){
				if(gold <= 100){
					System.out.println("You don't have enough money!!!");
					stat(user_name);
				}
				System.out.println("Thank you!");
				h_item += 1;
				item += 1;
				gold -= 100;
				shop(user_name, ErhdasEnc);
			}
			else if(choose_item.equals("mp")||choose_item.equals("MP")){
				if(gold <= 100){
					System.out.println("You don't have enough money!!!");
					stat(user_name);
				}
				System.out.println("Thank you!");
				m_item += 1;
				item += 1;
				gold -= 100;
				shop(user_name, ErhdasEnc);
			}
			else{
				shop(user_name, ErhdasEnc);
			}
		}
		else{
			stat(user_name);
		}
	}
	public static void useItemLobby(String user_name)
	{
		System.out.print("What item would you use? [HP MP]\n");
		String useHp = up.nextLine();
		if(useHp.equals("HP")||useHp.equals("hp")){
			if(h_item == 0){
				System.out.println("You don't have any!!");
				stat(user_name);
			}
			else if(h_item >= 1){
				if(hp == max_hp){
				System.out.println("Your health is already full!!!");
				stat(user_name);
				}
				else{
					System.out.println("You used HP potion!!\nYour HP refilled by \"200\"");
					hp += 200;
					if(hp > max_hp){
						hp = max_hp;
					}
				h_item -= 1;
				item -= 1;
				stat(user_name);
				}
			}
		}
		else if(useHp.equals("MP")||useHp.equals("mp")){
			if(m_item == 0){
				System.out.println("You don't have any!!");
				stat(user_name);
			}
			else if(m_item >= 1){
				if(mp == max_mp){
					System.out.println("Your magic Point is already full!!!");
					stat(user_name);
				}
				else{
					System.out.println("You used MP potion!!\nYour MP refilled by \"125\"");
					mp += 125;
					if(hp > max_mp){
						mp = max_mp;
					}
					m_item -= 1;
					item -= 1;
					stat(user_name);
				}
			}
		}
		else{
			System.out.println("Wrong!");
			stat(user_name);
		}
	}
	public static void hunt1(String user_name, int ErhdasEnc)
	{
		String mon_name = "Erhdas";
		
		String mon_kind1 = "of Happy";
		String mon_kind2 = "of Fury";
		String mon_kind3 = "of Sad";
		String mon_kind4 = "of Enjoy";
		
		int mon_hp =  rand.nextInt(50) + 100;
		int mon_atk = rand.nextInt(25) + 90;
		int mon_def = rand.nextInt(25) + 50;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("						|#|");
		System.out.println("						|##|");
		System.out.println("						|##|");
		System.out.println("						 |#|");
		System.out.println("						 |#|");
		System.out.println("						|##|");
		System.out.println("						|#|");
		System.out.println("						|##|");
		System.out.println("					   |####|");
		System.out.println("			  @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("			@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("		  @@@@@@@@@@@00000000@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@00%%%%%%%000@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@00%%%%%%%%00@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@0%%%%%%%%%%0@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@0%%%%%%%%%%0@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@00%%%%%%%%00@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@@0000000000@@@@@@@@@@@@@@@@@");
		System.out.println("		   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind1);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name, ErhdasEnc);
	}
	public static void hunt2(String user_name, int ErhdasEnc)
	{
		String mon_name = "Erhdas";
		
		String mon_kind1 = "of Happy";
		String mon_kind2 = "of Fury";
		String mon_kind3 = "of Sad";
		String mon_kind4 = "of Enjoy";
		
		int mon_hp =  rand.nextInt(25) + 100;
		int mon_atk = rand.nextInt(60) + 120;
		int mon_def = rand.nextInt(20) + 50;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("				|#|                               |#|   |#|");
		System.out.println("				|##|                              |##| |#|");
		System.out.println("				 |##|							   |#||#|");
		System.out.println("				 |#|							    |##|");
		System.out.println("				  |#|							   |#|");
		System.out.println("				   |##|	  @@@@@@@@@@@@@@@@@@@@@	 |##|");
		System.out.println("				     |#|@@@@@@@@@@@@@@@@@@@@@@@@@@@");																	
		System.out.println("	 				  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("	                 @@@@@@@@0000000000@@@@@@@@@@@@@@@");
		System.out.println("                    @@@@@@@000%%%%%%%%%000@@@@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@@");
		System.out.println("                @@@@@@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@@@@@@");
		System.out.println("              &@@@@@@@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@@@@@@@&");
		System.out.println("            &&@@@@@@@@@@@@@00%%%%%%%%%%%000@@@@@@@@@@@@@@@@@@@@&&");
		System.out.println("           &&&&&@@@@@@@@@@@@0000000000000@@@@@@@@@@@@@@@@@@@@@&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		System.out.println("           &&&&&&&&|@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@|&&&&&&&&&&&&");
		
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind2);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name, ErhdasEnc);	
	}
	public static void hunt3(String user_name, int ErhdasEnc)
	{
		String mon_name = "Erhdas";

		String mon_kind1 = "of Happy";
		String mon_kind2 = "of Fury";
		String mon_kind3 = "of Sad";
		String mon_kind4 = "of Enjoy";
		
		int mon_hp =  rand.nextInt(100) + 100;
		int mon_atk = rand.nextInt(30) + 60;
		int mon_def = rand.nextInt(30) + 70;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("					                               	  	     |#|");	
		System.out.println("					                                   |#|  |#|");
		System.out.println("					                                 	|#|  |#|");
		System.out.println("				    |#|                                 |#|   |#|");
		System.out.println("					|#|                           |#|   |#|  |#|");
		System.out.println("					|#|                          |#|   |#| |#|");
		System.out.println("				    |#|                           |#| |#| |#|");
		System.out.println("		      |#|  |#|   						   |#| |####|");
		System.out.println("			   |#||#|         					   |#| |#|");
		System.out.println("				|###|							   |####|");
		System.out.println("				   |##|	  @@@@@@@@@@@@@@@@@@@@@	 |###|");
		System.out.println("				     |#|@@@@@@@@@@@@@@@@@@@@@@@@@@@");																	
		System.out.println("	 			 |#|  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("	              |#|@@@@@@@@00000000000000@@@@@@@@@@@");
		System.out.println("                    @@@@@@@000%%%%%%%%%%%%000@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                	@@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%%%%000@@@@@@@@@@@");
		System.out.println("                    @@@@@@@00%%%%%%%%%%%%%000@@@@@@@@@@@@");
		System.out.println("                    &@@@@@@@000000000000000@@@@@@@@@@@&&&");
		System.out.println("           		     &&@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&");
		System.out.println("                      &&&&@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&");
		System.out.println("                        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("                        &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("                       &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("                    &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind4);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name, ErhdasEnc);
	}
	public static void bosshunt(String user_name,int ErhdasEnc)
	{
		String mon_name = "Erhdas";

		String mon_kind1 = "of Happy";
		String mon_kind2 = "of Fury";
		String mon_kind3 = "of Sad";
		String mon_kind4 = "of Enjoy";
		
		int mon_hp =  3 * (rand.nextInt(40) + 80);
		int mon_atk = 2 * (rand.nextInt(52) + 78);
		int mon_def = 2 * (rand.nextInt(30) + 40);
		
		System.out.println("!!BOSS Appeared!!");
		System.out.println("				                                 |##| ");
		System.out.println("		                 					     |#| ");
		System.out.println("			                  				    |#| ");
		System.out.println("				     						   |##|");
		System.out.println("				       	  @@@@@@@@@@@@@@@@@	 |###|");
		System.out.println("			|#|         @@@@@@@@@@@@@@@@@@@@@@@          |#|   |#|");																	
		System.out.println("	 		 |#| |###|@@@@@@@@@@@@@@@@@@@@@@@@@@@@        |#||##|");
		System.out.println("	          |#####|@@@@@@@@00000000000@@@@@@@@@@|##|    |###|");
		System.out.println("                    @@@@@@@000%%%%%%%%%000@@@@@@@@@|########");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%000@@@@@@@@@|####|");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%000@@@@@@@@@");
		System.out.println("                	@@@@@@00%%%%%%%%%%%%000@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%000@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%000@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%000@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%000@@@@@@@@@");
		System.out.println("                    @@@@@@00%%%%%%%%%%%%000@@@@@@@@@");
		System.out.println("           		    @@@@@@00%%%%%%%%%%%%000@@@@@@@@@");
		System.out.println("                    @@@@@@@00%%%%%%%%%%000@@@@@@@@@@");
		System.out.println("                    @@@@@@@@@00000000000@@@@@@@@@@@@");
		System.out.println("                     @@@@@@@@@@@@@@@@@@@@@@@@@@@@-----");
		System.out.println("                      @@@@@@@@@@@@@@@@@@@@@@@@@------");
		System.out.println("                      --------------------------**@***");
		System.out.println("                     ****************************&@***");
		System.out.println("                    **********************@@@@******@@");
		System.out.println("                    ***************************@&&&@****");
		System.out.println("                   &&&&&&&&********************&&&&&****");
		System.out.println("                   &&&&&&&&*******************&&&&&&&***");
		
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind3);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name, ErhdasEnc);
	}
	public static void hunt5(String user_name, int ErhdasEnc)
	{
		String mon_name = "Erhdas";
	
		String mon_kind5 = "of Rock";
		String mon_kind6 = "of Tenacious";
		String mon_kind7 = "of Flame";
		String mon_kind8 = "of Rest";
		
		int mon_hp =  rand.nextInt(80) + 150;
		int mon_atk = rand.nextInt(80) + 150;
		int mon_def = rand.nextInt(80) + 150;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("					@@@@@@@@@@@@@@@@|#|@@@");
		System.out.println("			  |    @@@@@@@@@@@@@@@@|##|@@@@");
		System.out.println("			 |#|   @@@@@@@@@@@@@@@|###|@@@@");
		System.out.println("			 |##| @@@@@@@@@@@@@@@|####|@@@@@");
		System.out.println("			 |###|@@@@@@@@@@@@@@|######|@@@@");
		System.out.println("			 |###|@@@@@@@@@@@@@@@----|*|@@@@");
		System.out.println("			  |--@@@@@@@@@@@@@@@@@@@@@|*|@@@@");
		System.out.println("			   @@@@@@@@@@@@@@@@@@@@@@@|*|@@@@@");
		System.out.println("			   @@@@@@@@@@@@@@@@@@@@@@@@|*|@@@@");
		System.out.println("		    @|@@@@@@@@@@@@@@@@@@@@@@@@@@|*|@@@@");
		System.out.println("		  @@|@@@@@@@000000000@@@@@@@@@@@|*|@@@@");
		System.out.println("		 @@@|@@@@@@00       000@@@@@@@@@|*|@@@");
		System.out.println("		 @@@|@@@@@@0         00@@@@@@@@@@|*|@@@@");
		System.out.println("		 @@@|@@@@@@0         00@@@@@@@@@@@|*|@@@");
		System.out.println("		 @@|@@@@@@@0         00@@@@@@@@@@@@@@@@@");
		System.out.println("		 @@|@@@@@@@0         00@@@@@@@@@@@@@@@@@");
		System.out.println("		 @@@@@@@@@@00       000@@@@@@@@@@@@@|&&|@");
		System.out.println("	 ^%%|@@@@@@@#@@@0000000000@@@@@@##@|^%%%%%%|@");
		System.out.println("   %%%%%%%|@@@@##___________________#|%%%%%%%%%%%|@");
		System.out.println("%%^%%%%%%%%|@@##################|%%%%^%%%%%%%%%%%%|@");
		System.out.println("%%%%%%%%$%$|@@@################|%%%%%%%%%%%%%%%%%%|@");
		
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind5);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name, ErhdasEnc);
	}
	public static void hunt6(String user_name, int ErhdasEnc)
	{
		String mon_name = "Erhdas";
	
		String mon_kind5 = "of Rock";
		String mon_kind6 = "of Tenacious";
		String mon_kind7 = "of Flame";
		String mon_kind8 = "of Rest";
		
		int mon_hp =  rand.nextInt(65) + 210;
		int mon_atk = rand.nextInt(70) + 50;
		int mon_def = rand.nextInt(100) + 150;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("						      |##|");
		System.out.println("						     |####|");
		System.out.println("						000000----00000000000");
		System.out.println("				    @@@@@@@@@@@@@@@@@@@@00000000");
		System.out.println("				@@@@@@@@@@@@@@@@@@@@@@@@@@@0000000");
		System.out.println("			  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@0000000");
		System.out.println("			 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@00000");
		System.out.println("			@@@\\----@@@@@@@@@-----/@@@@@@@@@@@000000");
		System.out.println("			@@@@@00 \\--@@@--/ 000@@@@@@@@@@@@@@000--0");
		System.out.println("			@@@@00     \\-/     000@@@@@@@@@@@@@000##--");
		System.out.println("			@@@000              000@@@@@@@@@@@@00#####-");
		System.out.println("		    @@@000              000@@@@@@@@@@@@000##--");
		System.out.println("		    @@@000              000@@@@@@@@@@@@000000");
		System.out.println("		    @@@000              000@@@@@@@@@@@@000000");
		System.out.println("		     @@000              000@@@@@@@@@@@@@00000");
		System.out.println("		     @@@000            000@@@@@@@@@@@@@@00000");
		System.out.println("		 __@@@@@0000000000000000@@@@@@@-----@@_____00");
		System.out.println("	    |##|@@@@@@@000000000000@@@@@---@@@@@@|#####|0");
		System.out.println("		 |##|    |##|    |#|                   |##|  ");
		System.out.println("		  |#|     |#|    |#|                    |#|  ");
		
		System.out.printf("|%14S %-18s|\n", mon_name, mon_kind6);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name, ErhdasEnc);
	}
	public static void hunt7(String user_name, int ErhdasEnc)
	{
		String mon_name = "Erhdas";
	
		String mon_kind5 = "of Rock";
		String mon_kind6 = "of Tenacious";
		String mon_kind7 = "of Flame";
		String mon_kind8 = "of Rest";
		
		int mon_hp =  rand.nextInt(70) + 180;
		int mon_atk = rand.nextInt(50) + 150;
		mon_s_atk = rand.nextInt(100) + 150;
		int mon_def = rand.nextInt(20) + 150;
		PsyOrPhy = 1;
		
		System.out.println("!!Monster Appeared!!");
		System.out.println("   $$    		   $         $         $$");
		System.out.println("	     $		   $$$      $$$         $$$");
		System.out.println("	     $$		    $    $$$$$$$$$     $$$$$$");
		System.out.println("	   $$$$$$$$$	       $$$$$$$$     $$$$$$");
		System.out.println("	$    $$$$$$$$$$    $$$$$$$$$$     $$$$$$$");
		System.out.println("	$$     $$$$$$$$$$ $$$$$$$$$$$$$ $$$$$$$");
		System.out.println("	 $      $$$$$$@@@@@@@$$$$$$$$$$$$@@@$$$$$");
		System.out.println("		  $$$$$$@@@@@@@@@@@@@@$$$$$$$$$$$$$$");
		System.out.println("		$$$$@@@@@@@@@@@@@@@@@@@@@$$$$$$$$$");
		System.out.println("	   $$$@@@@@@@@@@@@@@@@@@@@@@@@@$$$$$$$$$$");
		System.out.println("	   $@@@@@@@000000000000000@@@@@@@@$$$$$$$$");
		System.out.println("		@@@@@@00            000@@@@@@$$$$$$$$$");
		System.out.println("		@@@@@00              000@@@@@$$$$$$$$");
		System.out.println("	   $@@@@000              000@@@@$$$$$$$$$");
		System.out.println("		$@@@000              000@@@@$$$$$$$");
		System.out.println("		 $@@000              000@@@@@$$$$$$$$");
		System.out.println("	   $@@@@000              000@@@@@@$$$$$$$$");
		System.out.println("		$@@@@000            000@@@@@@@@@@$$");
		System.out.println("		 $@@@0000000000000000@@@@@@@@@@@@@$$  ");
		System.out.println("	     $@@@@@@000000000000@@@@@@@@@@@@@@@@@$");
		System.out.println("	   $@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$ ");
		System.out.println("	$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$$$");
		
		System.out.printf("|%14S %-18s|\n", mon_name, mon_kind7);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s%8S = %5s|\n", "def", mon_def, s_atk);
		
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name, ErhdasEnc);
	}
	public static void askHunt(int mon_atk,String user_name,  int mon_def, int mon_hp, String mon_name,int ErhdasEnc)
	{
		System.out.print("What would you do? [Attack Flee Defend Item Spell]\n");
		String user_command = up.nextLine();
		
		if(user_command.equals("attack")||user_command.equals("Attack"))
		{
			if(level < 11){
				fight1(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
			else if(level > 10 || level < 21){
				fight2(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
			else if(ErhdasEnc >= 5){
				fight2(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
		}
		else if(user_command.equals("Flee")||user_command.equals("flee"))
		{
			stat(user_name);
		}
		else if(user_command.equals("defend")||user_command.equals("Defend"))
		{
			defense(mon_def,mon_hp,mon_atk, mon_name, user_name,ErhdasEnc);
		}
		else if(user_command.equals("Item")||user_command.equals("item")){
			if(item <= 0){
				System.out.println("You don't have any!!");
				askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
			useItem(mon_def,mon_hp,mon_atk, mon_name, user_name,ErhdasEnc);
		}
		else if(user_command.equals("Spell")||user_command.equals("spell")){
			if(mp <= 0){
				System.out.println("You don't have enough MP!!");
				askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
			useSkill(mon_def,mon_hp,mon_atk, mon_name, user_name,ErhdasEnc);
		}
		else
		{
			askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
		}
	}
	public static void fight1(int mon_atk,String user_name,int mon_def, int mon_hp, String mon_name, int ErhdasEnc)
	{
		String mon_kind1 = "of Happy";
		int actual_a = atk - mon_def;
		if(actual_a <= 0){
			actual_a = 1;
		}
		int actual_d = mon_atk - def;
		if(def > mon_atk){
			actual_d = 1;
		}
		
		mon_hp = mon_hp - actual_a;
		if(mon_hp <= 0){
			mon_hp = 0;
		}
		if(ErhdasEnc == 2){
			mon_kind1 = "of Fury";
		}
		else if(ErhdasEnc == 3){
			mon_kind1 = "of Enjoy";
		}
		else if(ErhdasEnc == 4){
			mon_kind1 = "of Sad";
		}
		
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind1);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		System.out.printf("\"Erhdas %S\" got damaged by " + actual_a + "\n", mon_kind1);
		if(mon_hp > 0){
			System.out.printf("\"Erdhas %S\" used \'Fireball\'!\nYou got burned by " + actual_d + "\n\n", mon_kind1);
			hp = hp - actual_d;
			
			System.out.printf("%2S\n", user_name);
			System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "hp", hp, max_hp,"atk", atk);
			System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "mp", mp, max_mp,"def", def);
			System.out.printf("|%8S = %5s%8S : %3s/%5s|\n", "s_atk", s_atk, "exp", exp,max_exp);
			if(hp <= 0){
				hp = 0;
				System.out.printf("%S died!\n", name);
				System.out.println("!!!GAME OVER!!!");
				Respawn();
			}
			askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			
		}
		else if(mon_hp <= 0){
			int added_exp = rand.nextInt(100) + 75;
			int added_gold = rand.nextInt(75) + 43;
			if(ErhdasEnc == 3){
				added_exp = 2 * (rand.nextInt(100) + 75);
				added_gold = 2 * (rand.nextInt(75) + 43);
			}
			else if(ErhdasEnc == 4){
				added_exp = 3 * (rand.nextInt(150) + 115);
				added_gold = 3 * (rand.nextInt(125) + 75);
			}
			System.out.printf("!!" + mon_name + " %S died!!\nYou've earned " + added_exp + " points!!\nYou've earned " + added_gold + "G!!\n\n", mon_kind1);
			exp = exp + added_exp;			
			gold = gold + added_gold;
			stat(user_name);
		}
	}
	public static void fight2(int mon_atk,String user_name,int mon_def, int mon_hp, String mon_name, int ErhdasEnc)
	{
		String mon_kind1 = "";
		String mon_skill = "";
		String dmg_stt = "";
		
		int actual_a = atk - mon_def;
		if(actual_a <= 0){
			actual_a = 1;
		}
		
		mon_hp = mon_hp - actual_a;
		if(mon_hp <= 0){
			mon_hp = 0;
		}
		
		if(ErhdasEnc == 5){
			mon_kind1 = "of Rock";
			mon_skill = "Claw Clash";
			dmg_stt = "hammered";
		}
		else if(ErhdasEnc == 6){
			mon_kind1 = "of Tenacious";
			mon_skill = "Charge";
			dmg_stt = "bumped";
		}
		else if(ErhdasEnc == 7){
			mon_kind1 = "of Flame";
			mon_skill = "Volcanic Ash";
			dmg_stt = "burned";
		}
		else if(ErhdasEnc == 8){
			mon_kind1 = "of rest";
		}
		
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind1);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		System.out.printf("\"Erhdas %S\" got damaged by " + actual_a + "\n", mon_kind1);
		if(mon_hp > 0){
			System.out.printf("\"Erdhas %S\" used \'%s\'!\nYou got %s by " + mon_atk + "\n", mon_kind1, mon_skill, dmg_stt);
			hp -= mon_atk;
			System.out.printf("%2S\n", user_name);
			System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "hp", hp, max_hp,"atk", atk);
			System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "mp", mp, max_mp,"def", def);
			System.out.printf("|%8S = %5s%8S : %3s/%5s|\n", "s_atk", s_atk, "exp", exp,max_exp);
			if(PsyOrPhy == 1){
				System.out.printf("\"Erdhas %S\" used \'%s\'!\nYou got %s by " + mon_s_atk + "\n\n", mon_kind1, mon_skill, dmg_stt);
				hp -= mon_s_atk;
				System.out.printf("%2S\n", user_name);
				System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "hp", hp, max_hp,"atk", atk);
				System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "mp", mp, max_mp,"def", def);
				System.out.printf("|%8S = %5s%8S : %3s/%5s|\n", "s_atk", s_atk, "exp", exp,max_exp);
			}
			if(hp <= 0){
				hp = 0;
				System.out.printf("%S died!\n", name);
				System.out.println("!!!GAME OVER!!!");
				Respawn();
			}
			askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
		}
		else if(mon_hp <= 0){
			int added_exp = rand.nextInt(50) + 140;
			int added_gold = rand.nextInt(60) + 90;
			if(mon_kind1.equals("of Tenacious")){
				added_exp = 2 * (rand.nextInt(50) + 140);
				added_gold = 2 * (rand.nextInt(60) + 90);
			}
			System.out.printf("!!" + mon_name + " %S died!!\nYou've earned " + added_exp + " points!!\nYou've earned " + added_gold + "G!!\n", mon_kind1);
			exp = exp + added_exp;			
			gold = gold + added_gold;
			stat(user_name);
		}
	}
	public static void defense(int mon_def, int mon_hp, int mon_atk, String mon_name,  String user_name,int ErhdasEnc)
	{
		String mon_kind1 = "";
		String mon_skill = "";
		String dmg_stt = "";
		if(ErhdasEnc <= 4){
			mon_skill = "Fireball";
			dmg_stt = "burned";
			if(ErhdasEnc == 1){
				mon_kind1 = "of Happy";
			}
			else if(ErhdasEnc == 2){
				mon_kind1 = "of Fury";
			}		
			else if(ErhdasEnc == 3){
				mon_kind1 = "of Enjoy";
			}
			else if(ErhdasEnc == 4){
				mon_kind1 = "of Sad";
			}
		}
		if(ErhdasEnc == 5){
			mon_kind1 = "of Rock";
			mon_skill = "Claw Clash";
			dmg_stt = "hammered";
		}
		else if(ErhdasEnc == 6){
			mon_kind1 = "of Tenacious";
			mon_skill = "Charge";
			dmg_stt = "bumped";
		}
		else if(ErhdasEnc == 7){
			mon_kind1 = "of Flame";
			mon_skill = "Volcanic Ash";
			dmg_stt = "burned";
		}
		else if(ErhdasEnc == 8){
			mon_kind1 = "of rest";
		}
		
		int actual_d = mon_atk - def;
		if(actual_d < 0){
			actual_d = 1;
		}
		
		int actual_a = atk - (mon_def*2);
		if(actual_a <= 0){
			actual_a = 1;
		}
	
		System.out.printf("|%16S %-16s|\n", mon_name, mon_kind1);
		System.out.printf("|%8S = %5s%8S = %6s|\n", "hp", mon_hp, "atk", mon_atk);
		System.out.printf("|%8S = %5s                 |\n", "def", mon_def);
		
		System.out.printf("%2S\n", user_name);
		System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "hp", hp, max_hp,"atk", atk);
		System.out.printf("|%8S = %2s/%2s %8S = %6s|\n", "mp", mp, max_mp,"def", def);
		System.out.printf("|%8S = %5s%8S : %3s/%5s|\n", "s_atk", s_atk, "exp", exp,max_exp);
		System.out.printf("|%8S : %5s%8S : %9s|\n","Level" , level, "Gold" , gold);
		
		System.out.printf("%S got damaged by " + actual_d + "\n", name);
		System.out.printf("You countered \"Erdhas %S\" by " + actual_a + "\n", mon_kind1);
			
		mon_hp -= actual_a;
		if(mon_hp <= 0){
			mon_hp = 1;
			System.out.printf("!!\"Erdhas %S\" endured it!!\n", mon_kind1);
		}
		hp = hp - actual_d;
		if(hp <= 0){
			hp = 1;
			System.out.printf("!!\"%S\" endured it!!\n", name);
		}
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
	}
	public static void useItem(int mon_def, int mon_hp ,int mon_atk, String mon_name, String user_name, int ErhdasEnc)
	{
		String mon_kind1 = "";
		String mon_skill = "";
		String dmg_stt = "";
		if(ErhdasEnc <= 4){
			mon_skill = "Fireball";
			dmg_stt = "burned";
			if(ErhdasEnc == 1){
				mon_kind1 = "of Happy";
			}
			else if(ErhdasEnc == 2){
				mon_kind1 = "of Fury";
			}		
			else if(ErhdasEnc == 3){
				mon_kind1 = "of Enjoy";
			}
			else if(ErhdasEnc == 4){
				mon_kind1 = "of Sad";
			}
		}
		if(ErhdasEnc == 5){
			mon_kind1 = "of Rock";
			mon_skill = "Claw Clash";
			dmg_stt = "hammered";
		}
		else if(ErhdasEnc == 6){
			mon_kind1 = "of Tenacious";
			mon_skill = "Charge";
			dmg_stt = "bumped";
		}
		else if(ErhdasEnc == 7){
			mon_kind1 = "of Flame";
			mon_skill = "Volcanic Ash";
			dmg_stt = "burned";
		}
		else if(ErhdasEnc == 8){
			mon_kind1 = "of rest";
		}
		
		System.out.print("What item would you use? [HP MP]\n");
		String useHp = up.nextLine();
		
		if(useHp.equals("HP")||useHp.equals("hp")){
			if(h_item == 0){
				System.out.println("You don't have any!!");
				askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
			else if(h_item >= 1){
				hp = hp - mon_atk;
				System.out.println("You used HP potion!!\nYour HP refilled by \"200\"");
				hp += 200;
				if(hp > max_hp){
					hp = max_hp;
				}
				item -= 1;
				System.out.printf("\"Erdhas %S\" used \'%S\'!\nYou got %s by " + mon_atk + "\n", mon_kind1, mon_skill, dmg_stt);
				if(hp <= 0){
					hp = 0;
					System.out.printf("%S died!\n", name);
					System.out.println("!!!GAME OVER!!!");
					Respawn();
				}				
				askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
		}
		else if(useHp.equals("MP")||useHp.equals("mp")){
			if(m_item == 0){
				System.out.println("You don't have any!!");
				askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
			else if(m_item >= 1){
				hp = hp - mon_atk;
				System.out.println("You used MP potion!!\nYour MP refilled by \"125\"");
				mp += 125;
				if(hp > max_mp){
					mp = max_mp;
				}
				m_item -= 1;
				System.out.printf("\"Erdhas %S\" used \'%S\'!\nYou got %s by " + mon_atk + "\n", mon_kind1, mon_skill, dmg_stt);
				if(hp <= 0){
					hp = 0;
					System.out.printf("%S died!\n", name);
					System.out.println("!!!GAME OVER!!!");
					Respawn();
				}				
				askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
		}
		else if(useHp.equals("Back")||useHp.equals("back")){
			askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
		}
		else{
			System.out.println("Wrong!");
			useItem(mon_def,mon_hp,mon_atk, mon_name, user_name,ErhdasEnc);
		}
	}
	public static void useSkill(int mon_def, int mon_hp ,int mon_atk, String mon_name, String user_name, int ErhdasEnc)
	{	
		String mon_kind1 = "";
		String mon_skill = "";
		String dmg_stt = "";
		if(ErhdasEnc <= 4){
			mon_skill = "Fireball";
			dmg_stt = "burned";
			if(ErhdasEnc == 1){
				mon_kind1 = "of Happy";
			}
			else if(ErhdasEnc == 2){
				mon_kind1 = "of Fury";
			}		
			else if(ErhdasEnc == 3){
				mon_kind1 = "of Enjoy";
			}
			else if(ErhdasEnc == 4){
				mon_kind1 = "of Sad";
			}
		}
		if(ErhdasEnc == 5){
			mon_kind1 = "of Rock";
			mon_skill = "Claw Clash";
			dmg_stt = "hammered";
		}
		else if(ErhdasEnc == 6){
			mon_kind1 = "of Tenacious";
			mon_skill = "Charge";
			dmg_stt = "bumped";
		}
		else if(ErhdasEnc == 7){
			mon_kind1 = "of Flame";
			mon_skill = "Volcanic Ash";
			dmg_stt = "burned";
		}
		else if(ErhdasEnc == 8){
			mon_kind1 = "of rest";
		}
	
		System.out.print("What skill would you use? [Fireball]\n");
		String useFire = up.nextLine();
		if(useFire.equals("Fireball")||useFire.equals("fireball")){
			if(skill == 0){
				System.out.println("You don't learn any!!");
				askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
			}
			else if(skill >= 1){
				mon_hp -= s_atk;
				System.out.println("You used Fireball!!");
				mp -= 45;
				
				System.out.printf("\"%S\" used \'Fireball\'!\n\"Erdhas %S\" got burned by " + s_atk + "\n",name, mon_kind1);	
				if(mon_hp > 0){
					System.out.printf("\"Erdhas %S\" used \'%S\'!\nYou got %s by " + mon_atk + "\n", mon_kind1, mon_skill, dmg_stt);
					hp = hp - mon_atk;
				}
				else if(mon_hp <= 0){
					int added_exp = 2 * rand.nextInt(100) + 75;
					int added_gold = 2 * rand.nextInt(75) + 43;
					if(ErhdasEnc == 4){
						added_exp = 3 * (rand.nextInt(150) + 115);
						added_gold = 3 * (rand.nextInt(125) + 75);
					}
					System.out.printf("!!" + mon_name + " %S died!!\nYou've earned " + added_exp + " points!!\nYou've earned " + added_gold + "G!!\n", mon_kind1);
					exp = exp + added_exp;			
					gold = gold + added_gold;
					stat(user_name);
				}
				if(hp <= 0){
					hp = 0;
					System.out.printf("%S died!\n", name);
					System.out.println("!!!GAME OVER!!!");
					Respawn();
				}
			}
			askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);	
		}
		else if(useFire.equals("Back")||useFire.equals("back")){
			askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
		}
		else{
			System.out.println("Wrong spell!");
			useSkill(mon_def,mon_hp,mon_atk, mon_name, user_name,ErhdasEnc);
		}
		askHunt(mon_atk,user_name,mon_def,mon_hp,mon_name,ErhdasEnc);
		System.out.println("!!!Thanks for the playing!!!");
	}
	public static void Respawn()
	{
		System.out.println("\nWould you like to retry?[Yes][No]");
		String user_Respawn = up.nextLine();
		if(user_Respawn.equals("yes")||user_Respawn.equals("y")){
			start();
		}
		else if(user_Respawn.equals("no")||user_Respawn.equals("n")){
			System.exit(0);
		}
		else{
			Respawn();
		}
	}
}