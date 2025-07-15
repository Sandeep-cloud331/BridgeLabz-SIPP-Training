import java.util.*;

//  Interface for mdeiaPlayer 
interface Player{
	void addMedia(String... media);
	void playNext();
	void playPrev();
	void playCurrent();
	
}

//  Abstract class for media methods 
abstract class Media implements Player{
	ArrayList<String> list = new ArrayList<>(); 
	int curr =0;
	
	@Override
	public void addMedia(String... media){
		for(String s : media){
			list.add(s);
		}
	}
	
	@Override
	public void playNext(){
		curr = curr>= (list.size()-1)? 0: ++curr;
		System.out.println("Now playing :"+list.get(curr));
	}
	
	@Override
	public void playPrev(){
		curr = curr <=0 ?list.size()-1: --curr;
		System.out.println("Now playing :"+list.get(curr));
	}
	
	public void playCurrent(){
		if(list.size()>0){
			System.out.println("Now playing :"+list.get(curr));
		}else{
			System.out.println("List is empty");
		}
	}
	
	ArrayList<String> getList(){
		return list;
	}

}


//  Songs class 
class Song extends Media{
	
	void addSong(String... song){
		addMedia(song);
	}
	void playCurrentSong(){
		playCurrent();
	}
	void playPrevSong(){
		playPrev();
	}
	void playNextSong(){
		playNext();
	}
}

//  Videos class 
class Videos extends Media{
	
	void addVideo(String... video){
		addMedia(video);
	}
	void playCurrentVideo(){
		playCurrent();
	}
	void playPrevVideo(){
		playPrev();
	}
	void playNextVideo(){
		playNext();
	}
}


//  Podcasts class
class Podcasts extends Media{
	void addPodcast(String... podcast){
		addMedia(podcast);
	}
	void playCurrentPodcast(){
		playCurrent();
	}
	void playPrevPodcast(){
		playPrev();
	}
	void playNextPodcast(){
		playNext();
	}
}


class MusicPlayer{
	public static void main(String[] args){
		Videos vList = new Videos();
		vList.addVideo("tare zameen par","Inception","F1","Legend");
		vList.playNextVideo();
		Scanner sc = new Scanner(System.in);
		
		Song sList = new Song();
		sList.addSong("lal pari","jatta","pistol");
		sList.playCurrentSong();
		
		
		System.out.println(vList.curr);
		System.out.println(sList.curr);
	}
}
