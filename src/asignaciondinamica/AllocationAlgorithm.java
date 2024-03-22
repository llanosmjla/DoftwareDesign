package asignaciondinamica;

import java.util.List;

public class AllocationAlgorithm implements IAllocationAlgorithm{
    @Override
    public MemoryBlock getMemoryBlock(List<MemoryBlock> blocks, int size) {
        for (MemoryBlock block : blocks){
            if(block.IsFree() && block.getSize() >= size){
                return block;
            }
        }
        return null;
    }
}
