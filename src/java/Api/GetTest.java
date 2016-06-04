/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Api;

import flexjson.JSONSerializer;
import hib.FirstSubcategory;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * REST Web Service
 *
 * @author yogesh
 */
@Path("generic")
public class GetTest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GetTest
     */
    public GetTest() {
    }

    /**
     * Retrieves representation of an instance of Api.GetTest
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session s = sessionFactory.openSession();
        Criteria cr = s.createCriteria(FirstSubcategory.class);
        List results = cr.list();
        JSONSerializer serializer = new JSONSerializer();
        sessionFactory.close();
        return serializer.exclude("*.class").serialize(results);
    }

}
