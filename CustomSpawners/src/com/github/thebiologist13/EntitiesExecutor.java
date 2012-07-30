package com.github.thebiologist13;

import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.github.thebiologist13.commands.SpawnerCommand;
import com.github.thebiologist13.commands.entities.*;

public class EntitiesExecutor implements CommandExecutor {

	//private CustomSpawners plugin = null;
	
	private Logger log = null;
	
	private EntityAddEffectCommand aec = null;
	private EntityAgeCommand agc = null;
	private EntityAirCommand aic = null;
	private EntityAngryCommand anc = null;
	private EntityCatTypeCommand ctc = null;
	private EntityChargedCommand chc = null;
	private EntityClearEffectsCommand cec = null;
	private EntityColorCommand coc = null;
	private EntityCreateCommand crc = null;
	private EntityEnderBlockCommand ebc = null;
	private EntityHealthCommand hec = null;
	private EntityInfoCommand ifc = null;
	private EntityJockeyCommand joc = null;
	private EntityNameCommand nac = null;
	private EntityProfessionCommand prc = null;
	private EntityRemoveCommand rec = null;
	private EntitySaddledCommand sac = null;
	private EntitySelectCommand slc = null;
	private EntitySetEffectCommand sec = null;
	private EntitySetTypeCommand stc = null;
	private EntitySittingCommand sic = null;
	private EntitySlimeSizeCommand ssc = null;
	private EntityTamedCommand tac = null;
	private EntityVelocityCommand vec = null;
	
	public EntitiesExecutor(CustomSpawners plugin) {
		//this.plugin = plugin;
		this.log = plugin.log;
		
		aec = new EntityAddEffectCommand(plugin);
		agc = new EntityAgeCommand(plugin);
		aic = new EntityAirCommand(plugin);
		anc = new EntityAngryCommand(plugin);
		ctc = new EntityCatTypeCommand(plugin);
		chc = new EntityChargedCommand(plugin);
		cec = new EntityClearEffectsCommand(plugin);
		coc = new EntityColorCommand(plugin);
		crc = new EntityCreateCommand(plugin);
		ebc = new EntityEnderBlockCommand(plugin);
		hec = new EntityHealthCommand(plugin);
		ifc = new EntityInfoCommand(plugin);
		joc = new EntityJockeyCommand(plugin);
		nac = new EntityNameCommand(plugin);
		prc = new EntityProfessionCommand(plugin);
		rec = new EntityRemoveCommand(plugin);
		sac = new EntitySaddledCommand(plugin);
		slc = new EntitySelectCommand(plugin);
		sec = new EntitySetEffectCommand(plugin);
		stc = new EntitySetTypeCommand(plugin);
		sic = new EntitySittingCommand(plugin);
		ssc = new EntitySlimeSizeCommand(plugin);
		tac = new EntityTamedCommand(plugin);
		vec = new EntityVelocityCommand(plugin);
	}

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		
		Player p = null;
		
		if(arg0 instanceof Player) {
			p = (Player) arg0;
		}
		
		if(arg1.getName().equalsIgnoreCase("entities")) {
			try {
				
				if(arg3.length == 1) {
					
					if(arg3[0].equalsIgnoreCase("remove")) {
						rec.run(arg0, arg1, arg2, arg3);
						return true;
					}
					
				} else if(arg3.length == 2) {
					
					if(arg3[0].equalsIgnoreCase("setage")) {
						agc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setair")) {
						aic.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setangry")) {
						anc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setcattype")) {
						ctc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setcharged")) {
						chc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("cleareffects")) {
						cec.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setcolor")) {
						coc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("create")) {
						crc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setenderblock") || arg3[0].equalsIgnoreCase("setendermanblock")) {
						ebc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("sethealth")) {
						hec.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("info")) {
						ifc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setjockey")) {
						joc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setname")) {
						nac.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setprofession")) {
						prc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("remove")) {
						rec.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setsaddled")) {
						sac.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("select")) {
						slc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("settype")) {
						stc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setsitting")) {
						sic.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setslimesize") || arg3[0].equalsIgnoreCase("setsize")) {
						ssc.run(arg0, arg1, arg2, arg3);
						return true;
					}  else if(arg3[0].equalsIgnoreCase("settamed")) {
						tac.run(arg0, arg1, arg2, arg3);
						return true;
					}  else if(arg3[0].equalsIgnoreCase("setvelocity") || arg3[0].equalsIgnoreCase("setvector")) {
						vec.run(arg0, arg1, arg2, arg3);
						return true;
					}
					
				} else if(arg3.length == 3) {
					
					if(arg3[0].equalsIgnoreCase("setage")) {
						agc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setair")) {
						aic.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setangry")) {
						anc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setcattype")) {
						ctc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setcharged")) {
						chc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("cleareffects")) {
						cec.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setcolor")) {
						coc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setenderblock") || arg3[0].equalsIgnoreCase("setendermanblock")) {
						ebc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("sethealth")) {
						hec.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("info")) {
						ifc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setjockey")) {
						joc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setname")) {
						nac.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setprofession")) {
						prc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setsaddled")) {
						sac.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("settype")) {
						stc.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setsitting")) {
						sic.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("setslimesize") || arg3[0].equalsIgnoreCase("setsize")) {
						ssc.run(arg0, arg1, arg2, arg3);
						return true;
					}  else if(arg3[0].equalsIgnoreCase("settamed")) {
						tac.run(arg0, arg1, arg2, arg3);
						return true;
					}  else if(arg3[0].equalsIgnoreCase("setvelocity") || arg3[0].equalsIgnoreCase("setvector")) {
						vec.run(arg0, arg1, arg2, arg3);
						return true;
					}
					
				} else if(arg3.length == 4) {
					
					if(arg3[0].equalsIgnoreCase("addeffect")) {
						aec.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("seteffect")) {
						sec.run(arg0, arg1, arg2, arg3);
						return true;
					}
					
				} else if(arg3.length == 5) {
					
					if(arg3[0].equalsIgnoreCase("addeffect")) {
						aec.run(arg0, arg1, arg2, arg3);
						return true;
					} else if(arg3[0].equalsIgnoreCase("seteffect")) {
						sec.run(arg0, arg1, arg2, arg3);
						return true;
					}
					
				} else {
					if(arg0 instanceof Player) {
						p = (Player) arg0;
						p.sendMessage(SpawnerCommand.GENERAL_ERROR);
					} else {
						log.info("An error has occured with this command. Did you type everything right?");
					}
					return false;
				}
				
				return false;
			} catch(Exception e) {
				if(arg0 instanceof Player) {
					p = (Player) arg0;
					p.sendMessage(SpawnerCommand.GENERAL_ERROR);
				} else {
					log.info("An error has occured with this command. Did you type everything right?");
				}
			}
			return false;
		}
		return false;
	}

}