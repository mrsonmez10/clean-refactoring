package com.cleanref.chapter08.c07;

public class TestDrive {

    // HATIRLATMA


//    public void sendShutDown() {
//        DeviceHandle handle = getHandle(DEV1);
//        // Check the state of the device
//        if (handle != DeviceHandle.INVALID) {
//            // Save the device status to the record field
//            retrieveDeviceRecord(handle);
//            // If not suspended, shut down
//            if (record.getStatus() != DEVICE_SUSPENDED) {
//                pauseDevice(handle);
//                clearDeviceWorkQueue(handle);
//                closeDevice(handle);
//            } else {
//                logger.log("Device suspended. Unable to shut down");
//            }
//        } else {
//            logger.log("Invalid handle for: " + DEV1.toString());
//        }
//    }


//    public void sendShutDown(){
//        try{
//            tryToShutDown();
//        } catch(DeviceShutDownError e){
//            logger.log(e);
//        }
//    }
//
//    private void tryToShutDown() throws DeviceShutDownError{
//        DeviceHandle handle = getHandle(DEV1);
//        DeviceRecord record = retrieveDeviceRecord(handle);
//        pauseDevice(handle);
//        clearDeviceWorkQueue(handle);
//        closeDevice(handle);
//    }

}
