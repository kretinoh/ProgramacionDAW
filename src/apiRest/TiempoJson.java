package apiRest;



 class Main{
      private int temp; 
      private int feelsLike; 
      private int tempMin; 
      private int tempMax; 
      private int pressure; 
      private int seaLevel; 
      private int grndLevel; 
      private int humidity; 
      private int tempKf; 

       int getTemp(){
        return temp; 
      }
       void setTemp(int input){
         this.temp = input;
      }
       int getFeelsLike(){
        return feelsLike; 
      }
       void setFeelsLike(int input){
         this.feelsLike = input;
      }
       int getTempMin(){
        return tempMin; 
      }
       void setTempMin(int input){
         this.tempMin = input;
      }
       int getTempMax(){
        return tempMax; 
      }
       void setTempMax(int input){
         this.tempMax = input;
      }
       int getPressure(){
        return pressure; 
      }
       void setPressure(int input){
         this.pressure = input;
      }
       int getSeaLevel(){
        return seaLevel; 
      }
       void setSeaLevel(int input){
         this.seaLevel = input;
      }
       int getGrndLevel(){
        return grndLevel; 
      }
       void setGrndLevel(int input){
         this.grndLevel = input;
      }
       int getHumidity(){
        return humidity; 
      }
       void setHumidity(int input){
         this.humidity = input;
      }
       int getTempKf(){
        return tempKf; 
      }
       void setTempKf(int input){
         this.tempKf = input;
      }
}
 class Weather{
      private int id; 
      private String main; 
      private String description; 
      private String icon; 

       int getId(){
        return id; 
      }
       void setId(int input){
         this.id = input;
      }
       String getMain(){
        return main; 
      }
       void setMain(String input){
         this.main = input;
      }
       String getDescription(){
        return description; 
      }
       void setDescription(String input){
         this.description = input;
      }
       String getIcon(){
        return icon; 
      }
       void setIcon(String input){
         this.icon = input;
      }
}
 class Clouds{
      private int all; 

       int getAll(){
        return all; 
      }
       void setAll(int input){
         this.all = input;
      }
}
 class Wind{
      private int speed; 
      private int deg; 

       int getSpeed(){
        return speed; 
      }
       void setSpeed(int input){
         this.speed = input;
      }
       int getDeg(){
        return deg; 
      }
       void setDeg(int input){
         this.deg = input;
      }
}
 class Sys{
      private String pod; 

       String getPod(){
        return pod; 
      }
       void setPod(String input){
         this.pod = input;
      }
}
 class List{
      private int dt; 
      private Main main; 
      private List<Weather> weather; 
      private Clouds clouds; 
      private Wind wind; 
      private int visibility; 
      private int pop; 
      private Sys sys; 
      private String dtTxt; 

       int getDt(){
        return dt; 
      }
       void setDt(int input){
         this.dt = input;
      }
       Main getMain(){
        return main; 
      }
       void setMain(Main input){
         this.main = input;
      }
       List<Weather> getWeather(){
        return weather; 
      }
       void setWeather(List<Weather> input){
         this.weather = input;
      }
       Clouds getClouds(){
        return clouds; 
      }
       void setClouds(Clouds input){
         this.clouds = input;
      }
       Wind getWind(){
        return wind; 
      }
       void setWind(Wind input){
         this.wind = input;
      }
       int getVisibility(){
        return visibility; 
      }
       void setVisibility(int input){
         this.visibility = input;
      }
       int getPop(){
        return pop; 
      }
       void setPop(int input){
         this.pop = input;
      }
       Sys getSys(){
        return sys; 
      }
       void setSys(Sys input){
         this.sys = input;
      }
       String getDtTxt(){
        return dtTxt; 
      }
       void setDtTxt(String input){
         this.dtTxt = input;
      }
}
 class Coord{
      private int lat; 
      private int lon; 

       int getLat(){
        return lat; 
      }
       void setLat(int input){
         this.lat = input;
      }
       int getLon(){
        return lon; 
      }
       void setLon(int input){
         this.lon = input;
      }
}
 class City{
      private int id; 
      private String name; 
      private Coord coord; 
      private String country; 
      private int population; 
      private int timezone; 
      private int sunrise; 
      private int sunset; 

       int getId(){
        return id; 
      }
       void setId(int input){
         this.id = input;
      }
       String getName(){
        return name; 
      }
       void setName(String input){
         this.name = input;
      }
       Coord getCoord(){
        return coord; 
      }
       void setCoord(Coord input){
         this.coord = input;
      }
       String getCountry(){
        return country; 
      }
       void setCountry(String input){
         this.country = input;
      }
       int getPopulation(){
        return population; 
      }
       void setPopulation(int input){
         this.population = input;
      }
       int getTimezone(){
        return timezone; 
      }
       void setTimezone(int input){
         this.timezone = input;
      }
       int getSunrise(){
        return sunrise; 
      }
       void setSunrise(int input){
         this.sunrise = input;
      }
       int getSunset(){
        return sunset; 
      }
       void setSunset(int input){
         this.sunset = input;
      }
}
 public class TiempoJson{
      private String cod; 
      private int message; 
      private int cnt; 
      private List<List> list; 
      private City city; 

       String getCod(){
        return cod; 
      }
       void setCod(String input){
         this.cod = input;
      }
       int getMessage(){
        return message; 
      }
       void setMessage(int input){
         this.message = input;
      }
       int getCnt(){
        return cnt; 
      }
       void setCnt(int input){
         this.cnt = input;
      }
       List<List> getList(){
        return list; 
      }
       void setList(List<List> input){
         this.list = input;
      }
       City getCity(){
        return city; 
      }
       void setCity(City input){
         this.city = input;
      }
}
  