package nc;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Global.MOD_ID)
public class Nuclear {

	private static final Logger LOGGER = LogManager.getLogger();

	public Nuclear() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("Going Nuclear - Pre Init");
	}

	
	/*static {
		FluidRegistry.enableUniversalBucket();
	}

	public static NuclearCraft instance;
	
	@SidedProxy(clientSide = Global.NC_CLIENT_PROXY, serverSide = Global.NC_SERVER_PROXY)
	public static CommonProxy proxy;
	
	public BlockHighlightTracker blockOverlayTracker = new BlockHighlightTracker();
	
	@EventHandler
	public void onConstruction(FMLConstructionEvent constructionEvent) throws IOException {
		proxy.onConstruction(constructionEvent);
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		NCConfig.preInit();
		proxy.preInit(preEvent);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent) {
		proxy.postInit(postEvent);
		NCConfig.postInit();
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent serverStartEvent) {
		proxy.serverStart(serverStartEvent);
	}
	
	@EventHandler
	public void serverStop(FMLServerStoppedEvent serverStopEvent) {
		proxy.serverStop(serverStopEvent);
	}
	
	@EventHandler
	public void onIdMapping(FMLModIdMappingEvent idMappingEvent) {
		proxy.onIdMapping(idMappingEvent);
	}*/
}
