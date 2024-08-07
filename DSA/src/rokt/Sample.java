package rokt;

public class Sample {

    public static void main(String[] args) {
        System.out.println("Received number is" + args[0]);
        int number = Integer.parseInt(args[0]);
        for (int i = 1; i <= number; i++) {
            System.out.println("Square of " + i + " is " + (i * i));
        }


        public void findBrokenLinks(){
            Webdriver driver= new ChromeDriver();
            driver.get("Https/////////////");

           List<WebElements> links= driver.findElements(By.tagName("a"));

        for(Webelement link:links)
            verifyLink(link);
        }

        public void verifyLink(String url)
        {
            URL url=new URL(url);
            HTTPURLConnection connection= url.openConnection;
            connection.connect();

            if(connection.getResposeCode==200)
            {
                return true;
            }else
            {
                return false;
            }




        }
    }
}
