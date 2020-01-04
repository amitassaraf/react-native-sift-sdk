#import "RNSiftSdk.h"


#import "Sift/Sift.h"

@implementation RNSiftSdk

RCT_EXPORT_MODULE()

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}


RCT_EXPORT_METHOD(initSdk:(NSString *) accountid beaconkey:(NSString *)beaconkey)
{
  Sift *sift = [Sift sharedInstance];
  [sift setAccountId:accountid];
  [sift setBeaconKey:beaconkey];
  [sift setAllowUsingMotionSensors:NO];
  [sift setDisallowCollectingLocationData:YES];
}

RCT_EXPORT_METHOD(setUserId:(NSString *) userId)
{
  [[Sift sharedInstance] setUserId:userId];
}

RCT_EXPORT_METHOD(unsetUserId)
{
  [[Sift sharedInstance] unsetUserId];
}

@end

