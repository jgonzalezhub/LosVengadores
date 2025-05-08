package disSoftware.proyectoFinal;
import java.util.Scanner;

public class GameController{
    private DamageCalculator calculator;
    
public Player elegirPersonajePlayer(PlayerFactory character) {
    	
    	Player jugador = null;
    	Scanner scanner = new Scanner(System.in);
    	String input;
    	int numerin=0;
    	
    	
    	while(jugador==null) {
    		input=scanner.nextLine();
    		
    		try {
    	        numerin = Integer.parseInt(input);
    	    } catch (NumberFormatException e) {
    	        System.out.println("Entrada inválida. Por favor, introduce un número entre 1 y 4.");
    	        continue;
    	    }
    		
	    	switch(numerin) {
			case 1: 
				System.out.println("Has elegido a Capitan America");
				jugador= character.createCaptainAmerica();
				this.showCaptainAmerica();
				break;
			case 2: 
				System.out.println("Has elegido a Iron-Man");
				jugador= character.createIronMan();
				this.showIronMan();
				break;
				
			case 3: 
				System.out.println("Has elegido a Spider-Man");
				jugador=character.createSpiderMan();
				this.showSpiderMAn();
				break;
				
			case 4:
				System.out.println("Has elegido a Thor");
				jugador=character.createThor();
				this.showThor();
				break;
			default:
				System.out.println("Entrada inválida. Por favor, introduce un número entre 1 y 4.");
				break;
				
	    	}
    	}
    	return jugador;
    }
    
    public Enemy elegirPersonajelevel1(Integer numerin,World1Factory character) {
    	switch(numerin) {
		case 1: 
			System.out.println("El enemigo es Capitan America");
			return character.createCaptainAmerica();
		case 2: 
			System.out.println("El enemigo es Iron-Man");
			return character.createIronMan();
			
		case 3: 
			System.out.println("El enemigo es Spider-Man");
			return character.createSpiderMan();
			
		case 4:
			System.out.println("El enemigo es Thor");
			return character.createThor();
		default:
			System.out.println("El personaje que intentas utilizar no esta disponible");
			
    	}
    	return null;
    }
    
    public Enemy elegirPersonajelevel2(Integer numerin,World2Factory character) {
    	switch(numerin) {
		case 1: 
			System.out.println("El enemigo es Capitan America");
			return character.createCaptainAmerica();
		case 2: 
			System.out.println("El enemigo es Iron-Man");
			return character.createIronMan();
			
		case 3: 
			System.out.println("El enemigo es Spider-Man");
			return character.createSpiderMan();
			
		case 4:
			System.out.println("El enemigo es Thor");
			return character.createThor();
		default:
			System.out.println("El personaje que intentas utilizar no esta disponible");
			
    	}
    	return null;
    }
    public void showMenu(Player player,Enemy enemy) {
    	System.out.println("Jugador:"+ player.getName());
    	System.out.println("Enemigo:"+ enemy.getName());
    	System.out.println("╔══════════════════════════════╗");
    	System.out.println("║      🦸 AVENGERS MENU 🦸‍♀️     ║");
    	System.out.println("╠══════════════════════════════╣");
    	System.out.println("║ 1️.  Attack ⚔️                ║");
    	System.out.println("║ 2️.  Defend 🛡️                ║");
    	System.out.println("║ 3️.  Stats  📊                ║");
    	System.out.println("║ 4️.  Exit   👋                ║");
    	System.out.println("╚══════════════════════════════╝");
    	
    }
    
    public Integer fight(Player player,Enemy enemy) {
    	Integer playerTurn = 1;
    	while (player.isAlive() && enemy.isAlive()) {
            if (playerTurn == 1) {
            	playerTurn = 2;
            	showMenu(player, enemy);
                player.performAction(enemy);               
            } else {
            	playerTurn = 1;
                enemy.performAction(player);                
            }
            
        }
    	if(player.getHealth() <= 0) {
    		return 0;
    	}
    	return 1;
    }
    
    public void showCharacters() {
    	System.out.println("╔═══════════════════════════════╗");
        System.out.println("║     🦸 AVENGERS PLAYERS 🦸	║");
        System.out.println("╠═══════════════════════════════╣");
        System.out.println("║ 1. CAPITÁN AMÉRICA   🛡️      	║");
        System.out.println("║ 2. IRON MAN          🔧      	║");
        System.out.println("║ 3. SPIDER-MAN        🕷️      	║");
        System.out.println("║ 4. THOR              ⚡      	║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.println("Elige un personaje (1-4):");
    	
    }
    
    public void play() {
    	// estamos en el primer nivel
    	Integer number = 0;
    	Integer resultadoNivel1;
    	Integer resultadoNivel2;
    	Integer random =(int)(Math.random()*4)+1;
    	//Scanner scanner = new Scanner(System.in);
    	PlayerFactory playerFactory= new PlayerFactory();
    	World1Factory factory= new World1Factory();
    	Player player;
    	Enemy enemy;
    	showCharacters();
    	//number=scanner.nextInt();
    	player=this.elegirPersonajePlayer(playerFactory);
    	enemy = this.elegirPersonajelevel1(random,factory);
    	System.out.println("Va a comenzar la pelea");
    	resultadoNivel1=fight(player,enemy);
    	if(resultadoNivel1==0) {
    		System.out.println("DEFEAT");
    		System.exit(0);
    	}
    	System.out.println("VICTORY");
    	
    	// nivel 2
    	System.out.println("viajando al nivel 2");
    	//number=0;
    	player=null;
    	enemy=null;
    	World2Factory factoryLvl2= new World2Factory();
    	showCharacters();
    	//number=scanner.nextInt();
    	player=this.elegirPersonajePlayer(playerFactory);
    	enemy = this.elegirPersonajelevel2(random,factoryLvl2);
    	System.out.println("Va a comenzar la pelea");
    	resultadoNivel2=fight(player,enemy);
    	
    	if(resultadoNivel2==0) {
    		System.out.println("DEFEAT en level 2");
    		System.exit(0);
    	}
    	System.out.println("WINNER WINNER CHICKEN DINNER");
    }
    
    public void showCaptainAmerica() {
    	String asciiArtCapitan = """
    			----------------------:--+%%*####*==---------------------------
    			------------------------%%%*******%%%*=------------------------
    			---------------------=*%*+*++**+*****%%+=----------------------
    			------------------==*%%####***********#@#+=--------------------
    			------------------%%%%%%######+***+**+*%%@*+-------------------
    			------------------%%%%%%%%%#*##***++=**=%@*+-------------------
    			-------------------#%%%%%%%%*#%***#*::-=%@*+=------------------
    			-------------------#%%%%%%%%*#%#*#%*-#*=%%*+=------------------
    			-------------------%@@*%@%%%###%%%***#%%@%*+=------------------
    			--------------------*@++*%%%%*=+#%@%#%%@%#*+=------------------
    			--------------------*@=+*%%%****##=*%*%@#*+=-------------------
    			----------------------%@@%*++++***#**+#@#*==-------------------
    			--------------------+*##%###+++====+#@%#*+==-------------------
    			-----------------*#%%@@%%###%######%%@@@%%##+==----------------
    			---------------=##*=+#%%%****#%%%##*#%%%%+#@#*+=+***+===-------
    			----------------#*=+==%=---=*##=##*--=#*+%%%@%#@@%%%@*+===-----
    			:-------------+#*##**#%+====+==--=++**%%%%+=@@@%+==#%@%*+==----
    			:-------------*@%****#%#%%#%%=+#-+%***%#**%@@*+=-=-=+%@@*+===--
    			::-----------=#@%#*#%@%##%%#**#%***%%%*%@%@@%-=-+#+*+=*##*+==--
    			:::--------=**%%%%%%#*@%%#%#**##***%*#@@%@@*=-+%%%%%%%=*@#*+==-
    			:::--------+%*#%%@@#*==+#@%%%*#%*#%%@@@%#@%*-:+%%#*%%%%*=%%*+==
    			::::-----=%%%***@@#+===%@%%%%--+%%%%%@@%%@%*-:*%+++=*%%*=@%*+==
    			::::------%%%%%%@%#*=-=%@%%%%==+%%%%%@@%%@%+-:*%*==-*#%+=@#*+==
    			:::::-----%%%#%%%@%#++%*###*###%%%%#%@%*%@%+--*%%#*=#%%++@#*+==
    			:::::----=%%%%%%%%@#*#@**#%%%**#%%#**%@%@@%=--*%%%%%%%%++@#*===
    			:::::::----+%%%%%@%*%##%#*%%%%%%%%#*%##@@%@#*--+*%%%*+=%%#+====
    			:::::::::::--##%%+==%%%%%#**#@@%*%%%%%@@%%@%%%----==:*#%#+====-
    			::::::-::::::------=@%%%***%%%##@###%%@@%#*@@%=-:-==%@@*+====--
    			:::::::::::::::---*@#%%%##@%*===*@%%%%@@@@*+*%@**+#%@#+===-----
    			:::::--::::::::-+*%@#*#%@@#+=----=%@@###@@#*++#@@@%#+===-------
    			:::::::::::::::+%#%@##%#@%*+------%@@##*#%@@%*+=======---------
    			::::::-::::::::*%#######%@*=-----=%@%#%%%%#@%*==---------------
    			::::::::::::::::=@%%%%@@#+=--------*@%%%%@@%*+=----------------
    			:::----::::::::-=@###@%*+=----------=%%##%@#*==----------------
    			:::::--::::::::-+@%%@%*+=------------%###@@#*+==---------------
    			::::::::::::::-*%###@#*+--------------#@#%%@#*+=---------------
    			::::::::::::::-+****#===----:---------#@##%@#++==--------------
    			:::::::::::::::--------------------------======---------------=

    				                """;
    	System.out.println(asciiArtCapitan);
    }
    
    public void showSpiderMAn(){
    	String asciiArtSpider = """
    			
    	          .           . .     .                    .           
    	                      ..            . ..+*+=+:..     .  .   .  
    	     ........       .              ..==+#####**#+.......       
    	   ..*##*+++-.....   . . .........:##=+*##@%%%%%%%%##=....     
    	     %%###*+%+*%#-       .-##++##%#=%####%====.....+%#*=... . .
    	  .  .=%%%%####*#%###+-==.%##%++##%%#%#%*..       .@#####%%=.  
    	  ....=%#####%####%%%#####%@+.:###%@%@:         ..-%#==#%##=%..
    	  . +%%%#*=+#.+%%%%%%##*+#%%#::-#@%%*.   ...  ....=-......*%...
    	     .#%%##%@#+###*#####+=*#%#+#%##%..  ..-++++-    .   . ...  
    	     ....%*.:%#%###*########%@@###%#  .+==*#*#*+*..  .         
    	    ..         .#####*#%%%%%%%@%%%=..+=+*####+*#*....          
    	         .     ..#####*=###%%%%%%..++**=*%##*=+##..  .         
    	  .   .          ..%#####%%%##%=.++=+**#%%##==#=#..    .     . 
    	      .          ...%###*%%##+@+#***####%%%#**#==..            
    	                 ....*%%####+==####*==**#%%%##*=               
    	              .  ..#*==**===+%%###***#####%%##=.    .   . .    
    	            . .  :###*+=+##**#*+*########*.%##=. .             
    	 .  .      .     :#####===*######%%%####..#%%##=-**#%%..   .   
    	      .    .     .:#####*#+=%##%%#%%*-...-%%#%%%%%%%%: .       
    	      .  ... ..  ..=#######*##=.......  .%%%%%%%%%%-.       . .
    	.    . ....       ..%%%%###**+.         ..---...  .            
    	  .        . .      .-%%%%##*+.       . .   .       .   .      
    	   .                ....*%%##*... .     .            .         
    	  .              .    ....#%###:   .  .   .   .      .        .
    	 .                       ..:%%###+-.                         . 
    	..  .    .            .  . ..%%%#*=*=..     ...                
    	      . .                  ..:%%%%##+:.    .. .    .    ..     
    	 .    .                       ..*#%%#+.  .        ..         . 
    	               .    ..          .    . .              .        
    	             .           .      .             .  .      .      
    	 
    		                """;
    		    	System.out.println(asciiArtSpider);    	
    }
    
    public void showThor() {
		String asciiArtThor = """
			    
			     . .     ..-@@@. . .     .   .     .#@*=..  .       .      
			             :%%-*@:...                .#@**@+.           .    
			   .       ..:%%+=-@%.         .........#@**@+..               
			           .%@=-+==%#-:.   .---+%%%%%###%%%#*%@:               
			     .     .%@-:-=+-=@#.. -=%%#*+==--::::-##%@@+-.       .     
			       .   .%@+=:-=--**===#%+=---=+==---:::-+*%@%:      .      
			    .      .%@+==-:++.=@@%#*=======++-----:::-=%@+=. . .       
			   .       .:-##==+==---+#*+++=-:::==+=-----.:-*#@%.  . .      
			             :%%:-=+++=.-+**==-----:-==+=------+*@%.           
			             :%@#=:-=++-:.*#----------=+=------*#@%.     .     
			.              :@#++++++-.*#-=+*#+=:::=+=----=+@%:             
			            .  :@*----=#+--=###*=%@@#=-:::-=++=%%:             
			   .      .  .   +@@@**###=--=#*=:.#%@+:==:::*@@%:             
			               .    :@@@*-++++-*@=.@@#**==:-=#@@%:..  .        
			    .               :@%-#@+-+++=-#@=-::::::-*%@==@%.  .        
			        .         ....-@@@*+-=+=:#@::::::::-@%#==@%.           
			  .             ...@@@@@@@@@+++=:#@:::::::=+@%#**@%.          .
			  .           ...*@#****%@+=@#=-:#@+=---=+@@###**%#.       .   
			  .     .      :@%*#%####*@@-+@@@*=@@@@@@@@@@*-%%:             
			. .          .-+@%%@@#**##%%+=-=*++===++++*##*+%%=-.           
			             :%@#@@**+++*###%#++=*#++++**#+++*#%@@%.  . .      
			.           .:%@#@@==--=*%%%##@*-*########**#*+@@@%.     .     
			        .    :%@@#=-::-=#@@@@#=+*##***#%%%%#*+=%@-:.           
			           .+*@@@#====+#%@%%%#*****=+*####*+**#@@+-.     .     
			           .%@@@@*-:-@@@@@%%****#+-:-##%%%++-*@@@#+.        .  
			           .%@@@++++*@@%%%@@@@###=-####%%%==@%#@@#+...    ..   
			           .%@@%:--@@%%%%%%%%@@%****+-+*=-+*@#+**@@*=.         
			.          .%@@@+++@@%%%%%%%%%@%****+-+*=-**%@@##@@*=.       . 
			          *@%%@%---@@@@%%%%%%@@#-*####%@%%###%@*++*@@@:.       
			          *@##@%::::::=@@%%%@%+*#######%#####%@+===*+=@%       
			    .     *@##@%::::-*+:*@%%@%-+#-:-=##%##++-*%@@**=*@@@@@@+.. 
			    .   ..*@##@%:-=:-*#@@@@@+++*#=-+*##%##==+*#@@*#@%+==###%@=.
			        =@%#***#@@@++-+@@%@@=+########@@@%#####@@**@#-**=====#@
			        =@#******#%@@@@%%%@@+*######%@@@@@#####@@@@@#-+++*#*+%@
			       -+@#****#%%%%%%%%%%@@*+=+*##%@@@@@@%%#**@@%%@#=+*#*=+#@@
			      .@@##***##%%%%%%%%@@#***+++%@@@%@@##%%*#%@@%%@%###++*++%@
			       @@##***#%%%##%%%%@@+===*++%@%%%@@#***+#@%%%%%%@%#+++++*#
			   ..=*@%*****%%%%##%%%@%%+==+%@@%%%%%@@#***#%@%%%%%#*+======: 
			    .#@%#***##%%%%##%%%@#+***#@@%%%%%%@@%###@@@%%%%%#*:.   .   
			 ..=#%%#****%%%%###%%%%@%***@@@%%%%%%%@@####@@%%%%%%%#+=.    . 
			  .*@%#***##%%%%###%%%%@%###@@%%%%##%%@@%%%%@@%%%%%%%%#+.      
			  .*@#****#%%%%%###%%%%@%#@@%%%%####%%@@%%%%@@%%%%%%%%#+...  . 
			 =@%%#**##%%%%%%###%%@%+*#@@%%%%####%@@@#**#%@@@@%%%%%%%*=.... 
			 =@%****#%%%%#:....%%@@#*+%@%%%+......*@%%%%%%%%%@@%%%%%%%***:.
			@%*****%*......   .@@#####@@.....   .   .      . ..............
				                """;
				    	System.out.println(asciiArtThor);    	
    }
    
    public void showIronMan() {

			String asciiArtIron = """
	                                                 
                       .%@@@#*******#%#@@@@..                  
              .       +@****#####*******###@*.                 
           .          +@****##*---=********@*                  
    .    .  .      .%%%%###****=----+**####+*%%.              .
                   .%@%#####**+=---:-==####-+@@.   .    .      
.  . .             .@@%#####**+====-:--****-+@@.               
                   .@@%%####**+====-:-:-:-:-+@@.             . 
      .  .         .@@@%####+======-:-:-:-:-+@@.               
          .        .@@%%%%#===+*****+==---:=*@@.              .
   .   .    .      .@@%%##*====-:...=**-:-:-+@@.               
                 .. @@%%%%%%+======-:-:-:-:=*@@  .       .     
       .  .        ...+@%%#%***=============*@@.               
                      +@%######*+===--:----@*..  . .           
                      +@%%##@@%*+===+******@*.             . . 
                @@@@@@@@%#####%@#***=-:-*@@@*                  
           .****%@%@%%%%####%%%@%%%%#####%%@%***+              
         .=+%%%%###%++*#%%#######%%%%%%@%###%@@%#++.           
      .  .#@##*****#==+*####+=+******####**+*###%@@.           
.        .#@********##+-****:.:************-=**#%@@.           
       ...#@#%-.****#%+-**********+-:..-=******@@@@.           
 .         .@@+-**##%%%%###*******+.....-***#@@@#.             
    .    ...@@#*==--@@@@%%%%#%#%#**-:..-+**#%@@=+@@. .         
.        .#@**=-====@@#===+%%%%%#%#*****#%#=*@@*#@@.           
         .#@**=-:-+*@@@@#*+=--:-:--####%+-:@%===+@@.           
.        .#@****@@@@....%@@@#**====-----=**@@##%%%%@%.         
 .      @@#*----@@=      .=@+==-:--====*=:-@@%%%%##@%          
    .   @@#*==*%::.      .=@***+==------=++@@@@++**@#.       . 
      . @@#*--#@        *##%++=----=++++=--%%@@*++=%%##.       
 .  . =+#%##**++.       %@%#=:-====-====+++#%@@%#==#%@@.       
   .::%@**##@@-         %@%*-.-***+-----+##%%@@@%++#%@@::::.   
 .::@@@@####@@=:.     .:%@%*==+#*******%#%#%%@@%%%%%%%%@@@@::. 
..@@@@#***##**%@...   +@%##*#####***###%%%%#%@@.-@@%%%%####@@..
@@#*%%@@@@@@@@#*@@=   +@#*#%#%#%#*#@@@@%%%##%@@ ...@@%#@@@@#%@@
@@@@@@@@--:...#@@@=  .+@#*+-----+*#@%%#%*===*@@....@@%#@@@@@@@@
       .--..--...  ...+@--=***+-#@@@%%#=*##=*@@.   .:@@....--..
       .--..--..    @@*-******#@-.:@*==%#%#@*      ..--..--... 
       .--:.....   .@@%#****##%@-.:@@%%%###@*   .  ..--..--.. .
       ...--...    .@@%*%%%#%@#...:@%%#%@@@...    .......--..  
    .    .--....   .@@%*####@@#.  :@*==#%@@          ..--....  
         .--..   .=*%%*===*%+=-. .:@#**+#@@      .   ..--.     
         .::... ..*@##+==+*@-    .:@%##*#@@.         ..--.     
       . ......  .*@****%%##:    .:@%##*%@@    .     ..::..    
   .     .--...  .*@****@@*.     .:@%##=*@@. .      .......    
  .      ......  .*@--=*@@*      .:@*==%%@@...       ..--..    
       . .--... ..*@**=-%@*       ..=##%%%%@*.    .     .      
         .--... @@%#**%@:      .  ..=%#%#%#@*          .       
    .    .....  @@#***%@:.        ..:--%###@*        .     .   
       .        @@#*#%+-..       ...:--.:--..                  
     
	                """;
    	System.out.println(asciiArtIron);	
    }

}

