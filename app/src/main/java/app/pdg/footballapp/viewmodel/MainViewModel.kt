package app.pdg.footballapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import app.pdg.footballapp.model.League
import app.pdg.footballapp.model.Teams
import app.pdg.footballapp.model.Zone

class MainViewModel(application: Application) :AndroidViewModel(application) {


    fun leagueData(): LiveData<List<League>>{
        val leagues = ArrayList<League>()
        val leaguesData = MutableLiveData<List<League>>()
        leagues.add(League("FA Premier League", "https://seeklogo.com/images/P/premier-league-new-logo-D22A0CE87E-seeklogo.com.png",
            "https://resources.premierleague.com/photos/2020/09/16/88dba599-6caf-47f4-ace0-2fbde11d2b31/sterling-goal-wol-mci-1920.png?width=500&height=333",
            Zone.ZONE_UEFA.code, "The FA is a member of UEFA and FIFA,and holds a position " +
                    "forever on the International Football Association Board. Unlike other country " +
                    "football associations, the association does not take a national name on its title.\n" +
                    "\n" +
                    "All English professional clubs are members of The Football Association. " +
                    "The FA is responsible for the agreement of the management of the men's national " +
                    "team and the women's national team and the organization of the FA Cup. Although" +
                    " the FA does not operate day-to-day operations of the country's premier leagues," +
                    "the Premier League has a veto over the agreements of the League Chairman and Chief " +
                    "Executive and reserves the right to change any rules within the league.",
            teamEngland()))

        leagues.add(League("Shoopee Liga 1 ", "https://liga-indonesia.id/assets/img/competition-logo/63.png",
            "https://liga-indonesia.id/uploads/images/news/Kapten-Bali-United-Patuhi-Aturan-Protokol-Kesehatan-1600176277.jpeg",
        Zone.ZONE_AFC.code, "Liga 1 (Shopee Liga 1 for sponsorship reasons)[2], " +
                    "formerly named Indonesia Super League (English: Indonesia Super League)is a " +
                    "top-level professional league in the System of football leagues in Indonesia. " +
                    "18 clubs compete for the title with a system of promotion and relegation competitions.\n" +
                    "\n" +
                    "PT. Liga Indonesia Baru is the official operator of Liga 1 with 18 entrant " +
                    "clubs each as its main shareholders. The league runs in a full year (calendar) " +
                    "from March to November. A total of 34 matches for each league participant are" +
                    " played athome and away.",
        teamIndonesia()))

        leagues.add(League("Serie A", "https://vignette.wikia.nocookie.net/logopedia/images/1/12/Serie_A_2019.svg/revision/latest/scale-to-width-down/340?cb=20190710115458",
            "https://s01.sgp1.cdn.digitaloceanspaces.com/article/143253-kjoiymtxsh-1592885229.jpg",
            Zone.ZONE_UEFA.code, "Serie A, also called Serie A TIM due to sponsorship by TIM, " +
                    "is a professional league competition for football clubs located at the top of the " +
                    "Italian football league system and the winner is awarded the Scudetto and the Coppa " +
                    "Campioni d'Italia. \n\n" +
                    "It has been operating as a round-robin tournament for over ninety years since the 1929–30 season. " +
                    "It had been organized by the Direttorio Divisioni Superiori until 1943 and the Lega Calcio until 2010, " +
                    "when the Lega Serie A was created for the 2010–11 season. Serie A is regarded as one of the best football " +
                    "leagues in the world and it is often depicted as the most tactical and defensively sound national league." ,
            teamItaly()))

        leagues.add(League("Campeonato Brasileiro", "https://upload.wikimedia.org/wikipedia/id/thumb/4/4f/Brasileirao_Petrobras_Logo.png/200px-Brasileirao_Petrobras_Logo.png",
            "https://i.dailymail.co.uk/i/pix/2015/11/23/01/2EB4FCAA00000578-0-image-a-116_1448241223346.jpg",
            Zone.ZONE_CONMEBOL.code, "Campeonato Brasileiro Série A (BrazilianPortuguese: " +
                    "[kãmpjoˈnatu braziˈlejɪu ˈsɪɪii ˈa] ) (English: Brazilian Championship Series A)," +
                    "often referred to as Campeonato Brasileiro' and popular as Brasileirão " +
                    "(BrazilianPortuguese: [brazilejˈɪãw]), is an annual brazilian football league " +
                    "tournament organized by Confederação Brasileira de Futebol,or CBF. Followed by " +
                    "20 clubs, usually held from May to December, the league adheres to the system of " +
                    "promotion and relegation with Campeonato Brasileiro Série B. Each team played in " +
                    "38 games, for a total of 380 games in a season. Most matches are played on Saturday " +
                    "and Sunday afternoons with other matches played at night on weekdays" ,
            teamBrazil()))

        leagues.add(League("La Liga", "https://upload.wikimedia.org/wikipedia/en/3/35/La_Liga.png",
            "https://m.hindustantimes.com/rf/image_size_1200x900/HT/p2/2020/07/17/Pictures/la-liga-santander-real-madrid-v-villarreal_5d791c42-c7ad-11ea-bfec-9e6509a90ca1.jpg",
            Zone.ZONE_UEFA.code, "The Campeonato Nacional de Liga de Primera División,[a] " +
                    "commonly known as La Liga[b] (LaLiga Santander for sponsorship reasons with Santander)," +
                    "[2] is the men's top professional football division of the Spanish football league system.[3] " +
                    "Administered by the Liga Nacional de Fútbol Profesional (English: National Professional Football League)," +
                    " also known as the Liga de Fútbol Profesional, and is contested by 20 teams, " +
                    "with the three lowest-placed teams at the end of each season relegated to the " +
                    "Segunda División and replaced by the top two teams and a play-off winner in that division." ,
            teamSpain()))


        leaguesData.value = leagues
        return leaguesData
    }

    private fun teamIndonesia(): List<Teams>{
        val teams = ArrayList<Teams>()
        teams.add(Teams("Arema FC", "https://liga-indonesia.id/assets/img/clubs-logos/32.png"))
        teams.add(Teams("Bali United","https://liga-indonesia.id/assets/img/clubs-logos/71.png"))
        teams.add(Teams("Barito Putra", "https://liga-indonesia.id/assets/img/clubs-logos/133.png"))
        teams.add(Teams("Bhayangkara FC", "https://liga-indonesia.id/assets/img/clubs-logos/30.png"))
        teams.add(Teams("Borneo Fc", "https://liga-indonesia.id/assets/img/clubs-logos/192.png"))
        teams.add(Teams("Madura United", "https://liga-indonesia.id/assets/img/clubs-logos/40.png"))
        teams.add(Teams("Persebaya Surabaya","https://liga-indonesia.id/assets/img/clubs-logos/280.png"))
        teams.add(Teams("Persela Lamongan", "https://liga-indonesia.id/assets/img/clubs-logos/31.png"))
        teams.add(Teams("Persib Bandung", "https://liga-indonesia.id/assets/img/clubs-logos/11.png"))
        teams.add(Teams("Persija Jakarta", "https://liga-indonesia.id/assets/img/clubs-logos/12.png"))
        teams.add(Teams("Persik Kediri", "https://liga-indonesia.id/assets/img/clubs-logos/37.png"))
        teams.add(Teams("Persipura Jayapura","https://liga-indonesia.id/assets/img/clubs-logos/58.png"))
        teams.add(Teams("Persiraja Banda Aceh", "https://liga-indonesia.id/assets/img/clubs-logos/4.png"))
        teams.add(Teams("Persita Tangerang", "https://liga-indonesia.id/assets/img/clubs-logos/15.png"))
        teams.add(Teams("PS Tira", "https://liga-indonesia.id/assets/img/clubs-logos/125.png"))
        teams.add(Teams("PSIS Semarang", "https://liga-indonesia.id/assets/img/clubs-logos/20.png"))
        teams.add(Teams("PSM Makassar", "https://liga-indonesia.id/assets/img/clubs-logos/50.png"))
        teams.add(Teams("PSS Sleman", "https://liga-indonesia.id/assets/img/clubs-logos/23.png"))
        return teams
    }

    private fun teamEngland():List<Teams>{
        val teams = ArrayList<Teams>()
        teams.add(Teams("Arsenal", "https://resources.premierleague.com/premierleague/badges/70/t3.png"))
        teams.add(Teams("Aston Villa","https://resources.premierleague.com/premierleague/badges/70/t7.png"))
        teams.add(Teams("Brighton and Hove Albion", "https://resources.premierleague.com/premierleague/badges/70/t36.png"))
        teams.add(Teams("Burnley", "https://resources.premierleague.com/premierleague/badges/70/t90.png"))
        teams.add(Teams("Chelsea", "https://resources.premierleague.com/premierleague/badges/70/t8.png"))
        teams.add(Teams("Crystal Palace", "https://resources.premierleague.com/premierleague/badges/70/t31.png"))
        teams.add(Teams("Everton","https://resources.premierleague.com/premierleague/badges/70/t11.png"))
        teams.add(Teams("Fulham", "https://resources.premierleague.com/premierleague/badges/70/t54.png"))
        teams.add(Teams("Leeds United", "https://resources.premierleague.com/premierleague/badges/70/t2.png"))
        teams.add(Teams("Leicester City", "https://resources.premierleague.com/premierleague/badges/70/t13.png"))
        teams.add(Teams("Liverpool", "https://resources.premierleague.com/premierleague/badges/70/t14.png"))
        teams.add(Teams("Manchester City","https://resources.premierleague.com/premierleague/badges/70/t43.png"))
        teams.add(Teams("Manchester United","https://resources.premierleague.com/premierleague/badges/70/t1.png"))
        teams.add(Teams("Newcastle United", "https://resources.premierleague.com/premierleague/badges/70/t4.png"))
        teams.add(Teams("Sheffield United", "https://resources.premierleague.com/premierleague/badges/70/t49.png"))
        teams.add(Teams("Southampton", "https://resources.premierleague.com/premierleague/badges/70/t20.png"))
        teams.add(Teams("Tottenham Hotspur", "https://resources.premierleague.com/premierleague/badges/70/t6.png"))
        teams.add(Teams("West Bromwich Albion", "https://resources.premierleague.com/premierleague/badges/70/t35.png"))
        teams.add(Teams("West Ham United", "https://resources.premierleague.com/premierleague/badges/70/t21.png"))
        teams.add(Teams("Wolverhampton Wanderers", "https://resources.premierleague.com/premierleague/badges/70/t39.png"))
        return teams
    }

    private fun teamItaly(): List<Teams>{
        val teams = ArrayList<Teams>()
        teams.add(Teams("Atalanta", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/3/images/logo/810/original/loghi_400x400_0018_atalanta.png"))
        teams.add(Teams("Benevento","http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/86/images/logo/807/original/loghi_400x400_0017_benevento.png"))
        teams.add(Teams("Bologna", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/6/images/logo/638/original/bologna.png"))
        teams.add(Teams("Cagliari", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/28/images/logo/606/original/cagliari.png"))
        teams.add(Teams("Crotone", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/39/images/logo/804/original/loghi_400x400_0014_crotone.png"))
        teams.add(Teams("Fiorentina", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/15/images/logo/801/original/loghi_400x400_0013_fiorentina.png"))
        teams.add(Teams("Genoa","http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/21/images/logo/798/original/loghi_400x400_0012_genoa.png"))
        teams.add(Teams("Hellas Verona", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/19/images/logo/771/original/loghi400x400hellas-verona-blu.png"))
        teams.add(Teams("Internazionale", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/8/images/logo/642/original/inter.png"))
        teams.add(Teams("Juventus", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/1/images/logo/789/original/juve.png"))
        teams.add(Teams("Lazio FC", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/14/images/logo/30/original/lazio.png"))
        teams.add(Teams("AC Milan","http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/9/images/logo/620/original/milan.png"))
        teams.add(Teams("Napoli", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/12/images/logo/795/original/loghi_400x400_0007_napoli.png"))
        teams.add(Teams("Parma", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/25/images/logo/792/original/loghi_400x400_0003_parma.png"))
        teams.add(Teams("Roma", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/20/images/logo/819/original/loghi_400x400_0024_roma.png"))
        teams.add(Teams("Sampdoria", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/10/images/logo/626/original/sampdoria.png"))
        teams.add(Teams("Sassuolo", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/18/images/logo/816/original/loghi_400x400_0022_sassuolo.png"))
        teams.add(Teams("Spezia", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/41/images/logo/813/original/loghi_400x400_0021_spezia.png"))
        teams.add(Teams("Torino", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/17/images/logo/631/original/torino.png"))
        teams.add(Teams("Udinese", "http://www.legaseriea.it/uploads/default/attachments/squadre/squadre_m/22/images/logo/648/original/udinese.png"))
        return teams
    }

    private fun teamBrazil(): List<Teams>{
        val teams = ArrayList<Teams>()
        teams.add(Teams("Internacional", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00009rs.jpg?v=2020091700"))
        teams.add(Teams("Atletico- MG","https://conteudo.cbf.com.br/cdn/imagens/escudos/00003mg.jpg?v=2020091700"))
        teams.add(Teams("Sao Paolo", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00017sp.jpg?v=2020091700"))
        teams.add(Teams("Vasco da Gama", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00007rj.jpg?v=2020091700"))
        teams.add(Teams("Flamengo", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00006rj.jpg?v=2020091700"))
        teams.add(Teams("Palmeras", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00019sp.jpg?v=2020091700"))
        teams.add(Teams("Santos","https://conteudo.cbf.com.br/cdn/imagens/escudos/00018sp.jpg?v=2020091700"))
        teams.add(Teams("Fluminense", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00009rj.jpg?v=2020091700"))
        teams.add(Teams("Ceara", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00001ce.jpg?v=2020091700"))
        teams.add(Teams("Fortaleza", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00003ce.jpg?v=2020091700"))
        teams.add(Teams("Atletico - GO", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00004go.jpg?v=2020091700"))
        teams.add(Teams("Gremio","https://conteudo.cbf.com.br/cdn/imagens/escudos/00008rs.jpg?v=2020091700"))
        teams.add(Teams("Athletico Paranaense", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00004pr.jpg?v=2020091700"))
        teams.add(Teams("Sport", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00012pe.jpg?v=2020091700"))
        teams.add(Teams("Corinthians", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00021sp.jpg?v=2020091700"))
        teams.add(Teams("Bahia", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00005ba.jpg?v=2020091700"))
        teams.add(Teams("Batalogo", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00005rj.jpg?v=2020091700"))
        teams.add(Teams("Golas", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00009go.jpg?v=2020091700"))
        teams.add(Teams("Coritiba", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00006pr.jpg?v=2020091700"))
        teams.add(Teams("Red Bull Bragantino", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00006sp.jpg?v=2020091700"))
        return teams
    }

    private fun teamSpain(): List<Teams>{
        val teams = ArrayList<Teams>()
        teams.add(Teams("Athletic Club", "https://assets.laliga.com/assets/2019/06/07/xsmall/athletic.png"))
        teams.add(Teams("Atletico de Madrid","https://assets.laliga.com/assets/2019/06/07/xsmall/atletico.png"))
        teams.add(Teams("C.A. Osasuna", "https://assets.laliga.com/assets/2019/06/07/xsmall/osasuna.png"))
        teams.add(Teams("Cadiz C.F", "https://assets.laliga.com/assets/2019/06/07/xsmall/cadiz.png"))
        teams.add(Teams("Deportivo Alaves", "https://assets.laliga.com/assets/2020/09/01/xsmall/27002754a98bf535807fe49a24cc63ea.png"))
        teams.add(Teams("Elche C.F", "https://assets.laliga.com/assets/2019/06/07/xsmall/elche.png"))
        teams.add(Teams("F.C. Barcelona","https://assets.laliga.com/assets/2019/06/07/xsmall/barcelona.png"))
        teams.add(Teams("Getafe", "https://assets.laliga.com/assets/2019/06/07/xsmall/getafe.png"))
        teams.add(Teams("Granada", "https://assets.laliga.com/assets/2019/06/07/xsmall/granada.png"))
        teams.add(Teams("Levante", "https://assets.laliga.com/assets/2019/06/07/xsmall/levante.png"))
        teams.add(Teams("RC Celta", "https://assets.laliga.com/assets/2019/06/07/xsmall/celta.png"))
        teams.add(Teams("Real Betis","https://assets.laliga.com/assets/2019/06/07/xsmall/betis.png"))
        teams.add(Teams("Real Madrid", "https://assets.laliga.com/assets/2019/06/07/xsmall/real-madrid.png"))
        teams.add(Teams("Real Sociedad", "https://assets.laliga.com/assets/2019/06/07/xsmall/real-sociedad.png"))
        teams.add(Teams("Real Valladolid CF", "https://assets.laliga.com/assets/2019/06/07/xsmall/valladolid.png"))
        teams.add(Teams("SD Elbar", "https://assets.laliga.com/assets/2019/06/07/xsmall/eibar.png"))
        teams.add(Teams("SD Huesca", "https://assets.laliga.com/assets/2019/06/07/xsmall/huesca.png"))
        teams.add(Teams("Sevilla FC", "https://assets.laliga.com/assets/2019/06/07/xsmall/sevilla.png"))
        teams.add(Teams("Valencia CF", "https://assets.laliga.com/assets/2019/06/07/xsmall/valencia.png"))
        teams.add(Teams("Villareal CF", "https://conteudo.cbf.com.br/cdn/imagens/escudos/00006sp.jpg?v=2020091700"))
        return teams
    }


}