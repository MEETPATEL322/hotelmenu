import java.util.*;
class Hotelmenu{

        public static void main(String args[])
                 {   
                     int choice,starter,soup,pasta,snakes,dabeli,vadapau,dosa,idli,south,dhokla,panneer,gujarati;
                     Scanner objScanner=new Scanner(System.in);
                        System.out.println("1-----starter");
                        System.out.println("2------snakes");
                        System.out.println("3-----south");
                        System.out.println("4-----gujarati");
                        System.out.println("5------punjabi");
                        System.out.println("6------exit");

                        System.out.println("enter your choice");
                        choice=objScanner.nextInt();
                        switch(choice)
                         {
				case 1: System.out.println("u enter starter");
                            			System.out.println("1---soup");
						System.out.println("2---starter");
                                                System.out.println("enter yiur choice");
						starter=objScanner.nextInt();
						switch(starter)
							{
								case 1:System.out.println("u enter the soup");
									System.out.println("1---tommeto soup");
									System.out.println("2---manchau");
									System.out.println("entre u choice");
                                                                        soup=objScanner.nextInt();
									switch(soup)
										{ 
											case 1: System.out.println("u eneter tommento soup");
											break;
											case 2: System.out.println("u enetr manchau soup");
											break;
											case 3:System.exit(0);
									}
									break;		
								case 2:System.out.println("u enter starter");
									System.out.println("1---pasta");
									System.out.println("2---nuddeles");
									System.out.println("enter your choice");
                                                                       pasta=objScanner.nextInt();
                                                                     switch(pasta)
									{
                								case 1:System.out.println("u enter pasta");
											break;
										case 2:System.out.println("u enter noodels");
											break;
										case 3: System.exit(0);	
											}
								}
						

                                   break;
                                case 2:System.out.println("u enter snakes");
                            			System.out.println("1---dabeli");
						System.out.println("2---vadapau");
                                                System.out.println("enter yiur choice");
						snakes=objScanner.nextInt();
						switch(snakes)
							{
								case 1:System.out.println("u enter the dabeli");
									System.out.println("1---kachhi");
									System.out.println("2---butter");
									System.out.println("entre u choice");
                                                                        dabeli=objScanner.nextInt();
									switch(dabeli)
										{ 
											case 1: System.out.println("u eneter kacchi dabeli");
											break;
											case 2: System.out.println("u enetr butter dabeli");
											break;
											case 3:System.exit(0);
									}
									break;		
								case 2:System.out.println("u enter vadapau");
									System.out.println("1---bombay");
									System.out.println("2---oil");
									System.out.println("enter your choice");
                                                                       vadapau=objScanner.nextInt();
                                                                     switch(vadapau)
									{
                								case 1:System.out.println("u enter bombay");
											break;
										case 2:System.out.println("u enter oil vadapau");
											break;
										case 3: System.exit(0);	
											}
								}
					break;
 				case 3:System.out.println("u enter south");
                            			System.out.println("1---idli");
						System.out.println("2---dosa");
                                                System.out.println("enter yiur choice");
						south=objScanner.nextInt();
						switch(south)
							{
								case 1:System.out.println("u enter the idli");
									System.out.println("1---rava idli");
									System.out.println("2---cake idli");
									System.out.println("entre u choice");
                                                                        idli=objScanner.nextInt();
									switch(idli)
										{ 
											case 1: System.out.println("u eneter rava idli");
											break;
											case 2: System.out.println("u enetr cake idli ");
											break;
											case 3:System.exit(0);
									}
									break;		
								case 2:System.out.println("u enter dosa");
									System.out.println("1---maisur");
									System.out.println("2---plan");
									System.out.println("enter your choice");
                                                                       dosa=objScanner.nextInt();
                                                                     switch(dosa)
									{
                								case 1:System.out.println("u enter maisur");
											break;
										case 2:System.out.println("u enter plan");
											break;
										case 3: System.exit(0);	
											}
								}
					break;
				case 4:System.out.println("u enter gujarati");
                            			System.out.println("1---rsubji");
						System.out.println("2---dhokla");
                                                System.out.println("enter yiur choice");
						gujarati=objScanner.nextInt();
						switch(gujarati)
							{
								case 1:System.out.println("u enter the rsubji");
									System.out.println("1---panneer");
									System.out.println("2---sevtomm");
									System.out.println("entre u choice");
                                                                        panneer=objScanner.nextInt();
									switch(panneer)
										{ 
											case 1: System.out.println("u eneter panneer");
											break;
											case 2: System.out.println("u enetr sevtomm");
											break;
											case 3:System.exit(0);
									}
									break;		
								case 2:System.out.println("u enter dhokla");
									System.out.println("1---khaman");
									System.out.println("2---suji");
									System.out.println("enter your choice");
                                                                       dhokla=objScanner.nextInt();
                                                                     switch(dhokla)
									{
                								case 1:System.out.println("u enter khaman");
											break;
										case 2:System.out.println("u enter suji");
											break;
										case 3: System.exit(0);	
											}
								}
					break;
				case 5: System.exit(0);
						break;
	                              }
                      }
}