# monopoly
An artifact / API that will implement business logic and operations required to implement a Monopoly game

Try to use whatever possible from:
Apache Tomcat, Java 8, Spring, REST, Apache ActiveMQ JMS server, MySQL,

1. Understand the gameplay
2. define all users, components, actions
3. create all uses cases based on gameplay

Place
- String id
- String name
- String description
- enum Color
- int priceToBuy
- int pricePerHouse
- int priceForHotel
- int trespassingFees
- int rent
- String ownership —> playerId
— boolean isBought
— boolean canBuyHouse
— boolean canBuyHotel
— int payableRent
— int payableTrespassingFees

Enum Color
- String id
- String name
- String description
- String monopolyPlayer

PlayerPlaceOption (calculated when a player lands on a place)
- boolean playerOwnsThis
- boolean canBuyPlace
- int canBuyHouse (checks whether the player owns this place, whether he own complete Color,  )
- int canBuyHotel
- int payableRent
- int payableTrespassingFees

PlaceManager (helper class)
— PlaceOption getPlaceOption (Place, Player)
— boolean buyPlaceRequest (Place, Player)
— boolean buyHouse(Place,  Player)

Player
- String id
- String name
- String nickname
- URL image (URL for player avatar located in CDN)
- int money
- Place[] ownedPlaces

Assets
- Place[] places
- int money

TradeOptions
- String initiatorPlayer
- String offeredToPlayer
- Assets offeredForSaleAssets
- Assets offeredForBuyAssets

PlayerManager
— payMoney (Bank)
— payMoney (Player)
— boolean offerTrade (TradeOptions)
— buy (Place)
— sell (Place)
— buyOptions ()
— sellOption ()
— List<Place> getPlayerPlaces()
— List<Place> getPlayerPlaces(Color)

DieRoll
- boolean isDouble
- int rollCount()

DieRoller
- int rollDiceOne()
- int rollDiceTwo()
- DieRoll showDieRoll()

Board
- HashMap<Place, int position> places
- HashMap<Player, int position> playerPositions
- HashMap<Player, int position> playerPlaces
— movePlayerTo (Player, int position)

Bank extends Player
- int balance
//FUTURE: (can later have how many notes of each denomination)

PlayerBank extends Bank
- HashMap<Place, int> mortgages
— int netWorth() //Calc using player balance, places owned

GameBank extend Bank
- HashMap<Player, HashMap<Place, int>> playerMortgages

BankRepo
- money

CommunityChest
-

Question
-