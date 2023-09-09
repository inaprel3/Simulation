package simulation;

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import groovy.lang.Closure;
import repast.simphony.relogo.*;
import repast.simphony.relogo.builder.GeneratedByReLogoBuilder;
import repast.simphony.relogo.builder.ReLogoBuilderGeneratedFor;
import repast.simphony.space.SpatialException;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;

@GeneratedByReLogoBuilder
@SuppressWarnings({"unused","rawtypes","unchecked"})
public class ReLogoTurtle extends BaseTurtle{

	/**
	 * Makes a number of new users and then executes a set of commands on the
	 * created users.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created users
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public AgentSet<simulation.relogo.User> hatchUsers(int number, Closure closure) {
		AgentSet<simulation.relogo.User> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"User");
		for (Turtle t : createResult){
			if (t instanceof simulation.relogo.User){
				result.add((simulation.relogo.User)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new users and then executes a set of commands on the
	 * created users.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created users
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public AgentSet<simulation.relogo.User> hatchUsers(int number) {
		return hatchUsers(number,null);
	}

	/**
	 * Returns an agentset of users from the patch of the caller.
	 * 
	 * @return agentset of users from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public AgentSet<simulation.relogo.User> usersHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<simulation.relogo.User> result = new AgentSet<simulation.relogo.User>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"user")){
			if (t instanceof simulation.relogo.User)
			result.add((simulation.relogo.User)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of users on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of users at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public AgentSet<simulation.relogo.User> usersAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<simulation.relogo.User> result = new AgentSet<simulation.relogo.User>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"user")){
			if (t instanceof simulation.relogo.User)
			result.add((simulation.relogo.User)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<simulation.relogo.User>();
		}
	}

	/**
	 * Returns an agentset of users on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of users on patch p
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public AgentSet<simulation.relogo.User> usersOn(Patch p){
		AgentSet<simulation.relogo.User> result = new AgentSet<simulation.relogo.User>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"user")){
			if (t instanceof simulation.relogo.User)
			result.add((simulation.relogo.User)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of users on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of users on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public AgentSet<simulation.relogo.User> usersOn(Turtle t){
		AgentSet<simulation.relogo.User> result = new AgentSet<simulation.relogo.User>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"user")){
			if (tt instanceof simulation.relogo.User)
			result.add((simulation.relogo.User)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of users on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of users on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public AgentSet<simulation.relogo.User> usersOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<simulation.relogo.User>();
		}

		Set<simulation.relogo.User> total = new HashSet<simulation.relogo.User>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(usersOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(usersOn(p));
				}
			}
		}
		return new AgentSet<simulation.relogo.User>(total);
	}

	/**
	 * Queries if object is a user.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a user
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public boolean isUserQ(Object o){
		return (o instanceof simulation.relogo.User);
	}

	/**
	 * Returns an agentset containing all users.
	 * 
	 * @return agentset of all users
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public AgentSet<simulation.relogo.User> users(){
		AgentSet<simulation.relogo.User> a = new AgentSet<simulation.relogo.User>();
		for (Object e : this.getMyObserver().getContext().getObjects(simulation.relogo.User.class)) {
			if (e instanceof simulation.relogo.User){
				a.add((simulation.relogo.User)e);
			}
		}
		return a;
	}

	/**
	 * Returns the user with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.User")
	public simulation.relogo.User user(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof simulation.relogo.User)
			return (simulation.relogo.User) turtle;
		return null;
	}

	/**
	 * Makes a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public AgentSet<simulation.relogo.UserTurtle> hatchUserTurtles(int number, Closure closure) {
		AgentSet<simulation.relogo.UserTurtle> result = new AgentSet<>();
		AgentSet<Turtle> createResult = this.hatch(number,closure,"UserTurtle");
		for (Turtle t : createResult){
			if (t instanceof simulation.relogo.UserTurtle){
				result.add((simulation.relogo.UserTurtle)t);
			}
		} 
		return result;
	}

	/**
	 * Makes a number of new userTurtles and then executes a set of commands on the
	 * created userTurtles.
	 * 
	 * @param number
	 *            a number
	 * @param closure
	 *            a set of commands
	 * @return created userTurtles
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public AgentSet<simulation.relogo.UserTurtle> hatchUserTurtles(int number) {
		return hatchUserTurtles(number,null);
	}

	/**
	 * Returns an agentset of userTurtles from the patch of the caller.
	 * 
	 * @return agentset of userTurtles from the caller's patch
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public AgentSet<simulation.relogo.UserTurtle> userTurtlesHere(){
	  Grid grid = getMyObserver().getGrid();
	  GridPoint gridPoint = grid.getLocation(this);
	  AgentSet<simulation.relogo.UserTurtle> result = new AgentSet<simulation.relogo.UserTurtle>();
	  for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof simulation.relogo.UserTurtle)
			result.add((simulation.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns the agentset of userTurtles on the patch at the direction (ndx, ndy) from the
	 * caller.
	 * 
	 * @param nX
	 *            a number
	 * @param nY
	 *            a number
	 * @returns agentset of userTurtles at the direction (nX, nY) from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public AgentSet<simulation.relogo.UserTurtle> userTurtlesAt(Number nX, Number nY){
		double dx = nX.doubleValue();
		double dy = nY.doubleValue();
		double[] displacement = {dx,dy};

		try{
		GridPoint gridPoint = Utility.getGridPointAtDisplacement(getTurtleLocation(),displacement,getMyObserver());
		AgentSet<simulation.relogo.UserTurtle> result = new AgentSet<simulation.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(gridPoint,getMyObserver(),"userTurtle")){
			if (t instanceof simulation.relogo.UserTurtle)
			result.add((simulation.relogo.UserTurtle)t);
		}
		return result;
		}
		catch(SpatialException e){
			return new AgentSet<simulation.relogo.UserTurtle>();
		}
	}

	/**
	 * Returns an agentset of userTurtles on a given patch.
	 * 
	 * @param p
	 *            a patch
	 * @return agentset of userTurtles on patch p
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public AgentSet<simulation.relogo.UserTurtle> userTurtlesOn(Patch p){
		AgentSet<simulation.relogo.UserTurtle> result = new AgentSet<simulation.relogo.UserTurtle>();						
		for (Turtle t : Utility.getTurtlesOnGridPoint(p.getGridLocation(),getMyObserver(),"userTurtle")){
			if (t instanceof simulation.relogo.UserTurtle)
			result.add((simulation.relogo.UserTurtle)t);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the same patch as a turtle.
	 * 
	 * @param t
	 *            a turtle
	 * @return agentset of userTurtles on the same patch as turtle t
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public AgentSet<simulation.relogo.UserTurtle> userTurtlesOn(Turtle t){
		AgentSet<simulation.relogo.UserTurtle> result = new AgentSet<simulation.relogo.UserTurtle>();						
		for (Turtle tt : Utility.getTurtlesOnGridPoint(Utility.ndPointToGridPoint(t.getTurtleLocation()),getMyObserver(),"userTurtle")){
			if (tt instanceof simulation.relogo.UserTurtle)
			result.add((simulation.relogo.UserTurtle)tt);
		}
		return result;
	}

	/**
	 * Returns an agentset of userTurtles on the patches in a collection or on the patches
	 * that a collection of turtles are.
	 * 
	 * @param a
	 *            a collection
	 * @return agentset of userTurtles on the patches in collection a or on the patches
	 *         that collection a turtles are
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public AgentSet<simulation.relogo.UserTurtle> userTurtlesOn(Collection c){

		if (c == null || c.isEmpty()){
			return new AgentSet<simulation.relogo.UserTurtle>();
		}

		Set<simulation.relogo.UserTurtle> total = new HashSet<simulation.relogo.UserTurtle>();
		if (c.iterator().next() instanceof Turtle){
			for (Object o : c){
				if (o instanceof Turtle){
					Turtle t = (Turtle) o;
					total.addAll(userTurtlesOn(t));
				}
			}
		}
		else {
			for (Object o : c){
				if (o instanceof Patch){
					Patch p = (Patch) o;
					total.addAll(userTurtlesOn(p));
				}
			}
		}
		return new AgentSet<simulation.relogo.UserTurtle>(total);
	}

	/**
	 * Queries if object is a userTurtle.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userTurtle
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public boolean isUserTurtleQ(Object o){
		return (o instanceof simulation.relogo.UserTurtle);
	}

	/**
	 * Returns an agentset containing all userTurtles.
	 * 
	 * @return agentset of all userTurtles
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public AgentSet<simulation.relogo.UserTurtle> userTurtles(){
		AgentSet<simulation.relogo.UserTurtle> a = new AgentSet<simulation.relogo.UserTurtle>();
		for (Object e : this.getMyObserver().getContext().getObjects(simulation.relogo.UserTurtle.class)) {
			if (e instanceof simulation.relogo.UserTurtle){
				a.add((simulation.relogo.UserTurtle)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userTurtle with the given who number.
	 * 
	 * @param number
	 *            a number
	 * @return turtle number
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserTurtle")
	public simulation.relogo.UserTurtle userTurtle(Number number){
		Turtle turtle = Utility.turtleU(number.intValue(), getMyObserver());
		if (turtle instanceof simulation.relogo.UserTurtle)
			return (simulation.relogo.UserTurtle) turtle;
		return null;
	}

	/**
	 * Makes a directed registration from a turtle to the caller then executes a set of
	 * commands on the created registration.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created registration
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public simulation.relogo.Registration createRegistrationFrom(Turtle t, Closure closure){
		simulation.relogo.Registration link = (simulation.relogo.Registration)this.getMyObserver().getNetwork("Registration").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed registration from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created registration
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public simulation.relogo.Registration createRegistrationFrom(Turtle t){
			return createRegistrationFrom(t,null);
	}

	/**
	 * Makes directed registrations from a collection to the caller then executes a set
	 * of commands on the created registrations.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created registrations
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet<simulation.relogo.Registration> createRegistrationsFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<simulation.relogo.Registration> links = new AgentSet<simulation.relogo.Registration>();
		for(Turtle t : a){
			links.add((simulation.relogo.Registration)this.getMyObserver().getNetwork("Registration").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed registrations from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created registrations
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet<simulation.relogo.Registration> createRegistrationsFrom(Collection<? extends Turtle> a){
		return createRegistrationsFrom(a,null);
	}

	/**
	 * Makes a directed registration to a turtle from the caller then executes a set of
	 * commands on the created registration.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created registration
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public simulation.relogo.Registration createRegistrationTo(Turtle t, Closure closure){
		simulation.relogo.Registration link = (simulation.relogo.Registration)this.getMyObserver().getNetwork("Registration").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed registration to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created registration
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public simulation.relogo.Registration createRegistrationTo(Turtle t){
			return createRegistrationTo(t,null);
	}

	/**
	 * Makes directed registrations to a collection from the caller then executes a set
	 * of commands on the created registrations.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created registrations
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet<simulation.relogo.Registration> createRegistrationsTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<simulation.relogo.Registration> links = new AgentSet<simulation.relogo.Registration>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((simulation.relogo.Registration)this.getMyObserver().getNetwork("Registration").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed registrations to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created registrations
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet<simulation.relogo.Registration> createRegistrationsTo(Collection<? extends Turtle> a){
		return createRegistrationsTo(a,null);
	}

	/**
	 * Queries if there is a directed registration from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed registration from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public boolean inRegistrationNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Registration").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed registrations to the caller.
	 * 
	 * @return agentset with directed registrations to the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet inRegistrationNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Registration").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed registration from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed registration from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public simulation.relogo.Registration inRegistrationFrom(Turtle t){
		return (simulation.relogo.Registration)this.getMyObserver().getNetwork("Registration").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed registrations from other turtles to the caller.
	 * 
	 * @return agentset of directed registrations from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet<simulation.relogo.Registration> myInRegistrations(){
		AgentSet<simulation.relogo.Registration> result = new AgentSet<simulation.relogo.Registration>();
		for(Object o :  this.getMyObserver().getNetwork("Registration").getInEdges(this)){
			if (o instanceof simulation.relogo.Registration){
				result.add((simulation.relogo.Registration) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed registrations to other turtles from the caller.
	 * 
	 * @return agentset of directed registrations to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet<simulation.relogo.Registration> myOutRegistrations(){
		AgentSet<simulation.relogo.Registration> result = new AgentSet<simulation.relogo.Registration>();
		for(Object o :  this.getMyObserver().getNetwork("Registration").getOutEdges(this)){
			if (o instanceof simulation.relogo.Registration){
				result.add((simulation.relogo.Registration) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed registration to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed registration to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public boolean outRegistrationNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Registration").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed registrations from the caller.
	 * 
	 * @return agentset with directed registrations from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet outRegistrationNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Registration").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed registration to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed registration to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public simulation.relogo.Registration outRegistrationTo(Turtle t){
		return (simulation.relogo.Registration)this.getMyObserver().getNetwork("Registration").getEdge(this, t);
	}

	/**
	 * Reports true if there is a registration connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public boolean registrationNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("Registration").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * registrations connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet registrationNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("Registration").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's registrations.
	 * 
	 * @return agentset of the caller's registrations
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet<simulation.relogo.Registration> myRegistrations(){
		AgentSet<simulation.relogo.Registration> result = new AgentSet<simulation.relogo.Registration>();
		for(Object o : this.getMyObserver().getNetwork("Registration").getEdges(this)){
			if (o instanceof simulation.relogo.Registration){
				result.add((simulation.relogo.Registration)o);
			}
		}
		return result;
	}

	/**
	 * Queries if object is a registration.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a registration
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public boolean isRegistrationQ(Object o){
		return (o instanceof simulation.relogo.Registration);
	}

	/**
	 * Returns an agentset containing all registrations.
	 * 
	 * @return agentset of all registrations
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public AgentSet<simulation.relogo.Registration> registrations(){
		AgentSet<simulation.relogo.Registration> a = new AgentSet<simulation.relogo.Registration>();
		for (Object e : this.getMyObserver().getContext().getObjects(simulation.relogo.Registration.class)) {
			if (e instanceof simulation.relogo.Registration){
				a.add((simulation.relogo.Registration)e);
			}
		}
		return a;
	}

	/**
	 * Returns the registration between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return registration between two turtles
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public simulation.relogo.Registration registration(Number oneEnd, Number otherEnd) {
		return (simulation.relogo.Registration)(this.getMyObserver().getNetwork("Registration").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the registration between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return registration between two turtles
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.Registration")
	public simulation.relogo.Registration registration(Turtle oneEnd, Turtle otherEnd) {
		return registration(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Makes a directed userLink from a turtle to the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public simulation.relogo.UserLink createUserLinkFrom(Turtle t, Closure closure){
		simulation.relogo.UserLink link = (simulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public simulation.relogo.UserLink createUserLinkFrom(Turtle t){
			return createUserLinkFrom(t,null);
	}

	/**
	 * Makes directed userLinks from a collection to the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet<simulation.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a, Closure closure){
		AgentSet<simulation.relogo.UserLink> links = new AgentSet<simulation.relogo.UserLink>();
		for(Turtle t : a){
			links.add((simulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(t,this));
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks from a collection to the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet<simulation.relogo.UserLink> createUserLinksFrom(Collection<? extends Turtle> a){
		return createUserLinksFrom(a,null);
	}

	/**
	 * Makes a directed userLink to a turtle from the caller then executes a set of
	 * commands on the created userLink.
	 * 
	 * @param t
	 *            a turtle
	 * @param closure
	 *            a set of commands
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public simulation.relogo.UserLink createUserLinkTo(Turtle t, Closure closure){
		simulation.relogo.UserLink link = (simulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,t);
		if (closure != null){
			this.ask(link,closure);
		}
		return link;
	}

	/**
	 * Makes a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return created userLink
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public simulation.relogo.UserLink createUserLinkTo(Turtle t){
			return createUserLinkTo(t,null);
	}

	/**
	 * Makes directed userLinks to a collection from the caller then executes a set
	 * of commands on the created userLinks.
	 * 
	 * @param a
	 *            a collection
	 * @param closure
	 *            a set of commands
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet<simulation.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a, Closure closure){
		AgentSet<simulation.relogo.UserLink> links = new AgentSet<simulation.relogo.UserLink>();
		for(Object t : a){
			if (t instanceof Turtle){
				links.add((simulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").addEdge(this,(Turtle)t));
			}
		}
		if (closure != null){
			this.ask(links,closure);
		}
		return links;
	}

	/**
	 * Makes directed userLinks to a collection from the caller.
	 * 
	 * @param a
	 *            a collection
	 * @return created userLinks
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet<simulation.relogo.UserLink> createUserLinksTo(Collection<? extends Turtle> a){
		return createUserLinksTo(a,null);
	}

	/**
	 * Queries if there is a directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink from
	 *         turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public boolean inUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(t, this);
	}

	/**
	 * Returns the agentset with directed userLinks to the caller.
	 * 
	 * @return agentset with directed userLinks to the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet inUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getPredecessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink from a turtle to the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink from turtle t to the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public simulation.relogo.UserLink inUserLinkFrom(Turtle t){
		return (simulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(t,this);
	}

	/**
	 * Returns an agentset of directed userLinks from other turtles to the caller.
	 * 
	 * @return agentset of directed userLinks from other turtles to the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet<simulation.relogo.UserLink> myInUserLinks(){
		AgentSet<simulation.relogo.UserLink> result = new AgentSet<simulation.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getInEdges(this)){
			if (o instanceof simulation.relogo.UserLink){
				result.add((simulation.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Returns an agentset of directed userLinks to other turtles from the caller.
	 * 
	 * @return agentset of directed userLinks to other turtles from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet<simulation.relogo.UserLink> myOutUserLinks(){
		AgentSet<simulation.relogo.UserLink> result = new AgentSet<simulation.relogo.UserLink>();
		for(Object o :  this.getMyObserver().getNetwork("UserLink").getOutEdges(this)){
			if (o instanceof simulation.relogo.UserLink){
				result.add((simulation.relogo.UserLink) o);
			}
		}
		return result;
	}

	/**
	 * Queries if there is a directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return true or false based on whether there is a directed userLink to
	 *         turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public boolean outUserLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isPredecessor(this, t);
	}

	/**
	 * Returns the agentset with directed userLinks from the caller.
	 * 
	 * @return agentset with directed userLinks from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet outUserLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getSuccessors(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns the directed userLink to a turtle from the caller.
	 * 
	 * @param t
	 *            a turtle
	 * @return directed userLink to turtle t from the caller
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public simulation.relogo.UserLink outUserLinkTo(Turtle t){
		return (simulation.relogo.UserLink)this.getMyObserver().getNetwork("UserLink").getEdge(this, t);
	}

	/**
	 * Reports true if there is a userLink connecting t and the caller.
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public boolean userLinkNeighborQ(Turtle t){
		return this.getMyObserver().getNetwork("UserLink").isAdjacent(this, t);
	}

	/**
	 * Returns the agentset of all turtles found at the other end of
	 * userLinks connected to the calling turtle.
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet userLinkNeighbors(){
		AgentSet result = new AgentSet();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getAdjacent(this)){
			result.add(o);
		}
		return result;
	}

	/**
	 * Returns an agentset of the caller's userLinks.
	 * 
	 * @return agentset of the caller's userLinks
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet<simulation.relogo.UserLink> myUserLinks(){
		AgentSet<simulation.relogo.UserLink> result = new AgentSet<simulation.relogo.UserLink>();
		for(Object o : this.getMyObserver().getNetwork("UserLink").getEdges(this)){
			if (o instanceof simulation.relogo.UserLink){
				result.add((simulation.relogo.UserLink)o);
			}
		}
		return result;
	}

	/**
	 * Queries if object is a userLink.
	 * 
	 * @param o
	 *            an object
	 * @return true or false based on whether the object is a userLink
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public boolean isUserLinkQ(Object o){
		return (o instanceof simulation.relogo.UserLink);
	}

	/**
	 * Returns an agentset containing all userLinks.
	 * 
	 * @return agentset of all userLinks
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public AgentSet<simulation.relogo.UserLink> userLinks(){
		AgentSet<simulation.relogo.UserLink> a = new AgentSet<simulation.relogo.UserLink>();
		for (Object e : this.getMyObserver().getContext().getObjects(simulation.relogo.UserLink.class)) {
			if (e instanceof simulation.relogo.UserLink){
				a.add((simulation.relogo.UserLink)e);
			}
		}
		return a;
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            an integer
	 * @param otherEnd
	 *            an integer
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public simulation.relogo.UserLink userLink(Number oneEnd, Number otherEnd) {
		return (simulation.relogo.UserLink)(this.getMyObserver().getNetwork("UserLink").getEdge(turtle(oneEnd),turtle(otherEnd)));
	}

	/**
	 * Returns the userLink between two turtles.
	 * 
	 * @param oneEnd
	 *            a turtle
	 * @param otherEnd
	 *            a turtle
	 * @return userLink between two turtles
	 */
	@ReLogoBuilderGeneratedFor("simulation.relogo.UserLink")
	public simulation.relogo.UserLink userLink(Turtle oneEnd, Turtle otherEnd) {
		return userLink(oneEnd.getWho(), otherEnd.getWho());
	}

	/**
	 * Returns the value of the global variable Пользователь.
	 *
	 * @return the value of the global variable Пользователь
	 */
	@ReLogoBuilderGeneratedFor("global: Пользователь")
	public Object getПользователь(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("Пользователь");
	}

	/**
	 * Sets the value of the global variable Пользователь.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: Пользователь")
	public void setПользователь(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("Пользователь",value);
	}

	/**
	 * Returns the value of the global variable Курс.
	 *
	 * @return the value of the global variable Курс
	 */
	@ReLogoBuilderGeneratedFor("global: Курс")
	public Object getКурс(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("Курс");
	}

	/**
	 * Sets the value of the global variable Курс.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: Курс")
	public void setКурс(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("Курс",value);
	}

	/**
	 * Returns the value of the global variable numUsers.
	 *
	 * @return the value of the global variable numUsers
	 */
	@ReLogoBuilderGeneratedFor("global: numUsers")
	public Object getNumUsers(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numUsers");
	}

	/**
	 * Sets the value of the global variable numUsers.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numUsers")
	public void setNumUsers(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numUsers",value);
	}

	/**
	 * Returns the value of the global variable numCourses.
	 *
	 * @return the value of the global variable numCourses
	 */
	@ReLogoBuilderGeneratedFor("global: numCourses")
	public Object getNumCourses(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("numCourses");
	}

	/**
	 * Sets the value of the global variable numCourses.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: numCourses")
	public void setNumCourses(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("numCourses",value);
	}

	/**
	 * Returns the value of the global variable courseDuration.
	 *
	 * @return the value of the global variable courseDuration
	 */
	@ReLogoBuilderGeneratedFor("global: courseDuration")
	public Object getCourseDuration(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("courseDuration");
	}

	/**
	 * Sets the value of the global variable courseDuration.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: courseDuration")
	public void setCourseDuration(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("courseDuration",value);
	}

	/**
	 * Returns the value of the global variable Attack.
	 *
	 * @return the value of the global variable Attack
	 */
	@ReLogoBuilderGeneratedFor("global: Attack")
	public Object getAttack(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("Attack");
	}

	/**
	 * Sets the value of the global variable Attack.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: Attack")
	public void setAttack(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("Attack",value);
	}

	/**
	 * Returns the value of the global variable NSS.
	 *
	 * @return the value of the global variable NSS
	 */
	@ReLogoBuilderGeneratedFor("global: NSS")
	public Object getNSS(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("NSS");
	}

	/**
	 * Sets the value of the global variable NSS.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: NSS")
	public void setNSS(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("NSS",value);
	}

	/**
	 * Returns the value of the global variable NA.
	 *
	 * @return the value of the global variable NA
	 */
	@ReLogoBuilderGeneratedFor("global: NA")
	public Object getNA(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("NA");
	}

	/**
	 * Sets the value of the global variable NA.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: NA")
	public void setNA(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("NA",value);
	}

	/**
	 * Returns the value of the global variable IBD.
	 *
	 * @return the value of the global variable IBD
	 */
	@ReLogoBuilderGeneratedFor("global: IBD")
	public Object getIBD(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("IBD");
	}

	/**
	 * Sets the value of the global variable IBD.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: IBD")
	public void setIBD(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("IBD",value);
	}

	/**
	 * Returns the value of the global variable ET.
	 *
	 * @return the value of the global variable ET
	 */
	@ReLogoBuilderGeneratedFor("global: ET")
	public Object getET(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("ET");
	}

	/**
	 * Sets the value of the global variable ET.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: ET")
	public void setET(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("ET",value);
	}

	/**
	 * Returns the value of the global variable AR.
	 *
	 * @return the value of the global variable AR
	 */
	@ReLogoBuilderGeneratedFor("global: AR")
	public Object getAR(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("AR");
	}

	/**
	 * Sets the value of the global variable AR.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: AR")
	public void setAR(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("AR",value);
	}

	/**
	 * Returns the value of the global variable RD.
	 *
	 * @return the value of the global variable RD
	 */
	@ReLogoBuilderGeneratedFor("global: RD")
	public Object getRD(){
		return repast.simphony.relogo.ReLogoModel.getInstance().getModelParam("RD");
	}

	/**
	 * Sets the value of the global variable RD.
	 *
	 * @param value
	 *            a value
	 */
	@ReLogoBuilderGeneratedFor("global: RD")
	public void setRD(Object value){
		repast.simphony.relogo.ReLogoModel.getInstance().setModelParam("RD",value);
	}


}