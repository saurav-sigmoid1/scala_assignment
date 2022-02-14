case class teams(year:Int,name:String,country:String,matches:Int,runs:Int,wicket:Int) {}


object players{
  def highest_score(new_list:List[teams]): List[teams] ={
     val data = new_list.sortWith(_.runs > _.runs)
      data
  }
  def max_number_of_wicket(new_list:List[teams]):List[teams]={
     val data = new_list.sortWith(_.wicket>_.wicket)
    data
  }

  def rank_player_with_performance(new_list:List[teams]):List[teams]={
    val data = new_list.sortWith(_.wicket*5 > _.wicket*5).sortWith(_.runs*0.05>_.runs*0.05)
    data
  }

  def main(args:Array[String]):Unit={

    val team = List(teams(2021,"Ram","India",23,100,3),teams(2021,"Ram","India",23,2300,3),teams(2021,"Sam","India",25,300,5)
      ,teams(2021,"Mano","India",22,1300,8),teams(2021,"Sohan","India",27,2500,7)
      ,teams(2021,"Rohan","India",29,200,4),teams(2021,"Rohit","India",29,5200,2),teams(2021,"Raina","India",29,3200,9))

    println("==========player with highest score==========")
    val data = highest_score(team)
    println(s"name of player: ${data(0).name}")
    println(s"runs made by player: ${data(0).runs}")
    println(s"Year: ${data(0).year}")
    println(s"Country: ${data(0).country}")
    println(s"Total number of matches: ${data(0).matches}")
    println(s"total wicket taken by player: ${data(0).wicket}")

    println("========top 5 player with max score===============")
    val top_player = highest_score(team)
    var cnt1 =1
    for(ele<-top_player.take(5)){
      println(s"$cnt1 name of player: ${ele.name} -  run made by player: ${ele.runs}")
      cnt1 += 1

    }

    println("=======top 5 player with max wicket ===================")
    val new_team = max_number_of_wicket(team)
    var cnt2=1
    for(ele <- new_team.take(5)){
      println(s"$cnt2 name Of player: ${ele.name} -  number of wicket ${ele.wicket}")
      cnt2 += 1
    }

    println("======= Rank player over all performance=================")
    var cnt3 = 1
    val player_rank = rank_player_with_performance(team)
    for(ele <- player_rank){
      println(s"Rank:$cnt3 name:${ele.name} wicket:${ele.wicket} runs:${ele.runs}")
      cnt3+=1
    }
  }
}