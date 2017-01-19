package mainPackage;

public class Entity 
{
	public String Type; // has no effect. For identification in other
	public String Info; // info that is viewable
	public Shield EntityShield;
	public Weapon EntityWeapon;
	public Thruster EntityThruster;
	public double MaxHealth;//maximum health level
	public double CurrentHealth;//current health level
	public double HealthRegen;//health regained each tick
	public double EntityDamageSelfOnContact = 0;
	public double EntityDamageOnContact;
	public Object Miscellaneous = null;
	public Particle Host;
	//TODO need to add entity tags 
	// these tags tell what to do when damaged, dead, or born. 
	int wealth;
	public Entity(Particle host, String type, String info,//basic info 
			Shield entityshield, Weapon entityweapon, Thruster entitythruster,//things
				  double maxhealth, double healthregen, //health
				  double entitydamageoncontact)//contactbehavior
	{
		Host = host;
		Type = type;
		Info = info;
		EntityShield = entityshield;
		EntityWeapon = entityweapon;
		EntityThruster = entitythruster;
		MaxHealth = maxhealth;
		CurrentHealth = maxhealth;//defaults to full health. Can be modified if this is not needed
		HealthRegen = healthregen;
		EntityDamageOnContact = entitydamageoncontact;
	}
}
