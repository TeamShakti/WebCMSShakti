

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;

/**
 * Servlet implementation class readdatabase
 */
@WebServlet("/readdatabse")
public class readdatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public readdatabase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Session session  = sessionobject.sessionFactoryObject().openSession();
		Query q = session.createQuery("from Channel");
		Query q1 = session.createQuery("from VOD");
		Query q2 = session.createQuery("from Programme");
		Query q3 = session.createQuery("from Package");
		
		//for channel
		List ch_list = q.list();
		//System.out.println(list.get(0));
		Channel ch=(Channel)ch_list.get(0);
		System.out.println(ch.getChannelid());
		System.out.println(ch.getChannelURL());
		System.out.println(ch.getCountry());
		System.out.println(ch.getDescription());
		System.out.println(ch.getGenre());
		System.out.println(ch.getImageURL());
		System.out.println(ch.getLanguage());
		System.out.println(ch.getRegion());
		System.out.println(ch.getTitle());
		List Channel_package = (List) ch.getPackage_list();
		Iterator itr = Channel_package.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	    //for VOD
		List VOD_list = q1.list();
		VOD vod = (VOD)VOD_list.get(0);
		System.out.println(vod.getCountry());
		System.out.println(vod.getdescription());
		System.out.println(vod.getDuration());
		System.out.println(vod.getGenre());
		System.out.println(vod.getImageURL());
		System.out.println(vod.getLanguage());
		System.out.println(vod.getProvider());
		System.out.println(vod.getRating());
		System.out.println(vod.getRegion());
		System.out.println(vod.getShowtype());
		System.out.println(vod.getTitle());
		System.out.println(vod.getVodID());
		System.out.println(vod.getVodURL());
		Credits credits = (Credits)vod.getCredits();
		System.out.println(credits.getActor());
		System.out.println(credits.getDirector());
		System.out.println(credits.getProducer());
		System.out.println(credits.getWriter());
		List vod_package = (List) vod.getPackage_list();
		Iterator itr1 = vod_package.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		//for programme
		List programme_list = q2.list();
		Programme programme = (Programme)programme_list.get(0);
		System.out.println(programme.getChannelid());
		System.out.println(programme.getCountry());
		System.out.println(programme.getDescription());
		System.out.println(programme.getDuration());
		System.out.println(programme.getEnd());
		System.out.println(programme.getGenre());
		System.out.println(programme.getLanguage());
		System.out.println(programme.getProgramID());
		System.out.println(programme.getRating());
		System.out.println(programme.getStart());
		System.out.println(programme.getTitle());
		Credits credits1 = (Credits)programme.getCredits();
		System.out.println(credits1.getActor());
		System.out.println(credits1.getDirector());
		System.out.println(credits1.getProducer());
		System.out.println(credits1.getWriter());
		
		
		//for package
		List package_list = q3.list();
		Package packag = (Package)package_list.get(0);
		System.out.println(packag.getCountry());
		System.out.println(packag.getCurrency());
		System.out.println(packag.getDescription());
		System.out.println(packag.getPackageID());
		System.out.println(packag.getPrice());
		System.out.println(packag.getRegion());
		System.out.println(packag.getTitle());

		
		
		
		
	}

 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
