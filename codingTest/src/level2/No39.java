package level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class No39 {
	
	public String solution(String m, String[] musicinfos) throws ParseException {
		
		String answer = "(None)";
		
		m = m.replaceAll("C#", "c");
		m = m.replaceAll("D#", "d");
		m = m.replaceAll("F#", "f");
		m = m.replaceAll("G#", "g");
		m = m.replaceAll("A#", "a");
		
		int max = -1;
		
		for (int i=0; i<musicinfos.length; i++) {
			
			String[] music = musicinfos[i].split(",");
			
			SimpleDateFormat f = new SimpleDateFormat("HH:mm", Locale.KOREA);
			
			Date start = f.parse(music[0]);
			Date end = f.parse(music[1]);
			long diff = end.getTime() - start.getTime();
			long minute = diff / (1000*60);
			
			String musicInfo = music[3];
			
			musicInfo = musicInfo.replaceAll("C#", "c");
			musicInfo = musicInfo.replaceAll("D#", "d");
			musicInfo = musicInfo.replaceAll("F#", "f");
			musicInfo = musicInfo.replaceAll("G#", "g");
			musicInfo = musicInfo.replaceAll("A#", "a");
			
			StringBuilder sb = new StringBuilder();
			boolean contains = false;
			
			int size = musicInfo.length();
			
			// 분이 더 짧다면 조금만 돌아야 한다.
			for(int j=0; j<minute; j++) {
				
				// 2번만 붙여도 가능한지 여부를 알 수 있다.
				if(sb.toString().length() >= m.length()*2 && j>=musicInfo.length()*2) break;
				
				sb.append(musicInfo.charAt(j%size));
				if(sb.toString().length() >= m.length() && sb.toString().contains(m)) {
					contains = true;
					break;
				}
			}
			
			if(contains) {
				// 재생시간이 같은 경우 변경하지 않는다.
				if(max == (int)minute) continue;
				
				// 조건이 일치하는 음악이 여러개 일때는 라디오에서 재생된 시간이 제일 긴 음악 제목을 반환한다.
				if((int)minute > max) {
					max = (int)minute;
					answer = music[2];
				}
			}
		}
		
		return answer;
	}
}
