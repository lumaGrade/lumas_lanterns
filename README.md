# luma's Lanterns
luma's Lanterns adds more lanterns and makes them wall mountable.
## Lanterns
Currently on build 0.1.0 there is only wall mountable vanilla lantern.

## Recipes
    Wall mounted Vanilla Lantern:
    N = Iron nugget
    L = lantern
    
    N N -
    N L -
    - - -

--------


## Development notes

BASE CLASSES

For hanging/standing lantern block: block/custom/CustomLanternBlock 

For wall hanging lantern block: block/custom/WallCustomLanternBlock


### Creating a new lantern:

Create new class

/block/custom/PaperLanternBlock

Extend it either from CustomLanternBlock or WallCustomLanternBlock:

public class PaperLanternBlock extends CustomLanternBlock

This class needs a constructor and createBlockEntity method.

Constructor:

    public PaperLanternBlock(Settings settings) {
        super(settings);
    }

createBlockEntity method:

     @Nullable
     @Override
      public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
         return new PaperLanternEntity(pos, state);
      }


Create new class /block/entity/PaperLanternBlockEntity

Extend from BlockEntity:

public class PaperLanternEntity extends BlockEntity

Add constructor:

    public PaperLanternEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PAPER_LANTERN_ENTITY, pos, state);
    }


Add new Block on /block/ModBlocks class

    public static final Block PAPER_LANTERN = registerBlock("paper_lantern", new PaperLanternBlock(FabricBlockSettings.of(Material.METAL).luminance(15).strength(3.5f, 3.5f).nonOpaque().sounds(BlockSoundGroup.LANTERN).requiresTool().nonOpaque()), ItemGroup.DECORATIONS);


Add new BlockEntity on /block/entity/ModBlockEntities class

    public static BlockEntityType<PaperLanternEntity> PAPER_LANTERN_ENTITY;


You also need to register block entity on registerBlockEntities() method

    PAPER_LANTERN_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE,
    new Identifier(LumasLanterns.MOD_ID, "paper_lantern_entity"),
    FabricBlockEntityTypeBuilder.create(PaperLanternEntity::new,
    ModBlocks.PAPER_LANTERN).build(null));


Register client renderer for a new lantern at ExtendedLanternsClient class' rergisterRenderers() method

    BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PAPER_LANTERN, RenderLayer.getCutout());



### Defining collision shape:

Add following to the /block/custom/PaperLanternBlock class and define correct dimensions:

    private static VoxelShape SHAPE = Block.createCuboidShape(5, 1, 5, 11, 16, 11);

VoxelShape needs to be overwritten. Add getOutlineShape method to PaperLanternBlock class:

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
    return SHAPE;
    }



### Adding ticker method:

For more complex lanterns you may wish to add ticker method to your lantern:

Add BlockEntityTicker method on /block/custom/PaperLanternBlock class:

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, ModBlockEntities.PAPER_LANTERN_ENTITY, PaperLanternEntity::tick);
    }

Add tick method on /block/entity/PaperLanternEntity class:

    public static void tick(World world, BlockPos blockPos, BlockState state, WallVanillaLanternEntity entity) {
    }


