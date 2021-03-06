Change Log
==========



## changes in 1.7-SNAPSHOT
* for compatibility with Cesium 1.34
* removed GeometryPipeline.computeBinormalAndTangent
* removed the url and key properties from GeocoderViewModel and GeocoderViewModelOptions
* added CompressedTextureBuffer
* added scene to BingMapsGeocoderServiceOptions
* added fixedFrameTransform to Transforms.headingPitchRollToFixedFrame
* added fixedFrameTransform to Transforms.headingPitchRollQuaternion
* added localFrameToFixedFrameGenerator to Transforms
* added scaleByDistance to Label
* added var selectedEntityChanged: Event and trackedEntityChanged: Event, to Viewer
* removed ArcGisImageServerTerrainProvider and corresponding options
* added  disableDepthTestDistance to Billboard, Label, PointGraphics
* added DEFAULT_OFFSET to Camera object
* added GoogleEarthEnterpriseTerrainProvider and options
* removed fromHeadingPitchRoll(heading,pitch,roll,result)

* upgraded to Scala.js-0.6.16 and changed @JSName to  @JSGlobal

// todo 
// Add new flight parameters to Camera.flyTo and 
// Camera.flyToBoundingSphere: flyOverLongitude, flyOverLongitudeWeight, and pitchAdjustHeight.
// remove left, right, bottom, and top from OrthographicFrustum 
// add OrthographicOffCenterFrustum


## changes in 1.6
* for compatibility with Cesium 1.30

* added GeocoderService interface
* added BingMapsGeocoderService and BingMapsGeocoderServiceOptions
* added CartographicGeocoderService
* added GeocoderResult
* added perInstanceAttribute to DebugAppearanceOptions
* renamed binormal to bitangent in VertexFormat and GeometryAttributes
* added GeometryPipeline.createTangentAndBitangent 
* deprecate GeometryPipeline.computeBinormalAndTangent
* added cross building and publishing for scala 2.11.8 and 2.12.1
* added Rectangle.fromRadians
* exposed availability property of TerrainProvider 
* added sampleTerrainMostDetailed to Cesium object
* added ImagerySplitDirection enum
* added splitDirection to ImageryLayerOptions
* added imagerySplitPosition to Scene properties
* added blendOption to BillboardCollection, LabelCollection, and PointPrimitiveCollection
* added BlendOption enum


## changes in 1.5
* for compatibility with Cesium 1.29

* changed headingPitchRollToFixedFrame and headingPitchRollQuaternion to take headingPitchRoll: HeadingPitchRoll 
* removed headingPitchRollToFixedFrame and aircraftHeadingPitchRollQuaternion 
that did not take headingPitchRoll: HeadingPitchRoll 
* added () to class PinBuilder(), AssociativeArray(), Event(), EventHelper(), 
GeometryAttributes(), GregorianDate(), MapProjection(), Queue(), CompositeMaterialProperty(),
DataSourceClock(), DataSourceCollection(), KmlFeatureData(), TimeIntervalCollectionProperty(),
Fog(), ImageryLayerCollection(), ImageryLayerFeatureInfo(), NeverTileDiscardPolicy(),
OrthographicFrustum(), PerspectiveFrustum(), PerspectiveOffCenterFrustum(),
Sun(), InfoBoxViewModel(), NavigationHelpButtonViewModel()
* added ColorBlendMode 
* added color, colorBlendMode, and colorBlendAmount properties to Model and ModelGraphics 
* added new Label properties showBackground, backgroundColor and backgroundPadding 
* added new LabelGraphicsOptions showBackground, backgroundColor and backgroundPadding also to LabelGraphics
* added new enum VerticalOrigin.BASELINE
* added def divideComponents to Cartesian2, Cartesian3 and Cartesian4
* added WebGLConstants
* added silhouetteSize and silhouetteColor to ModelOptions and ModelGraphicsOptions

## changes in 1.4
* for compatibility with Cesium 1.27

* changed the scene parameter for creating BillboardVisualizer, LabelVisualizer, and PointVisualizer has been removed. Instead, pass an instance of EntityCluster.
* added clusterBillboards, clusterLabels, and cluserPoints properties to EntityCluster to selectively cluster screen space entities.
* added EntityCluster and EntityClusterOptions
* added DebugCameraPrimitive and DebugCameraPrimitiveOptions
* added clustering to DataSource
* added DistanceDisplayConditions to all primitives: BillboardGraphicsOptions, BoxGraphicsOptions, CorridorGraphicsOptions, 
CylinderGraphicsOptions, EllipsoidGraphicsOptions, EllipseGraphicsOptions, LabelGraphicsOptions,
ModelGraphicsOptions, PathGraphicsOptions, PointGraphicsOptions, PolygonGraphicsOptions,
PolylineGraphicsOptions, PolylineVolumeGraphicsOptions, RectangleGraphicsOptions, WallGraphicsOptions and
their respective primitive.

* added simpleIntersection to Rectangle
* Added HeadingPitchRoll :
  HeadingPitchRoll.fromQuaternion function for retrieving heading-pitch-roll angles from a quaternion.
  HeadingPitchRoll.fromDegrees function that returns a new HeadingPitchRoll instance from angles given in degrees.
  HeadingPitchRoll.clone function to duplicate HeadingPitchRoll instance.
  HeadingPitchRoll.equals and HeadingPitchRoll.equalsEpsilon functions for comparing two instances.
  
* added Matrix3.fromHeadingPitchRoll Computes a 3x3 rotation matrix from the provided headingPitchRoll. 
* added Transforms.aircraftHeadingPitchRollToFixedFrame to create a local frame from a position and heading/pitch/roll angles. The local frame is north-west-up axed.
* added Transforms.aircraftHeadingPitchRollQuaternion which is the quaternion rotation from Transforms.aircraftHeadingPitchRollToFixedFrame.
  
* removed @JSName("xxx") for all traits
  
  
## changes in 1.3
* for compatibility with Cesium 1.25, released on 03/08/2016

* added clampToGround to GeoJsonDataSource
* added urlSchemeZeroPadding to UrlTemplateImageryProviderOptions and UrlTemplateImageryProvider
* removed protected constructor from JulianDate
* changed ClockRange and ClockStep apply() param to take Int
* added a set of implicits in CesiumImplicits
* changed dayNumber and secondsOfDay in JulianDate to be Int
* changed all pack() methods to return a js.Array[Double]  
* changed class Command to trait Command

* added shadows Property to BoxGraphics, CorridorGraphics, CylinderGraphics, EllipseGraphics, 
EllipsoidGraphics, PolygonGraphics, PolylineGraphics, 
PoylineVolumeGraphics, RectangleGraphics, and WallGraphics

* removed castShadows and receiveShadows from ModelGraphicsOptions, Primitive, Globe
* added ShadowMode enum to Cesium
* added shadows of type Int to ModelGraphics and ModelGraphicsOptions, Primitive, Globe
* changed Viewer.terrainShadows to be of type Int (ShadowMode) instead of Boolean
* added cancelFlight() to Camera
* added keepExpanded to Geocoder
* added fromName(name: String) to ComponentDatatype
* changed all def cornerType(v: CornerType) to def cornerType(v: Int) in CesiumOptions

## changes in 1.2

* changed CustomDataSource, CzmlDataSource, GeoJsonDataSource and KmlDataSource to extends DataSource
* changed Packable to be a simple trait that extends js.Object
* added trait PackableStatic that extends Packable, so that derived classes extends Packable and
their companion object extends PackableStatic which has the required static methods.
* changed BoundingSphere, BoxGeometry, BoxOutlineGeometry, Cartesian2, Cartesian3, Cartesian4, CircleGeometry,
CircleOutlineGeometry, Color, CorridorGeometry, Matrix4, NearFarScalar, Rectangle,
VertexFormat to extends Packable and their corresponding object extends PackableStatic
* changed Quaternion to extends PackableForInterpolation
* changed class TerrainProvider to trait TerrainProvider
* removed object TerrainProvider and moved its methods to trait TerrainProvider
* changed VRTheWorldTerrainProvider, ArcGisImageServerTerrainProvider, CesiumTerrainProvider, EllipsoidTerrainProvider,
to extends TerrainProvider
* changed class TerrainData to trait TerrainData
* changed HeightmapTerrainData and QuantizedMeshTerrainData to extends TerrainData
* changed class GeometryUpdater to trait GeometryUpdater
* changed object GeometryUpdater to trait GeometryUpdaterStatic
* changed EllipseGeometryUpdater, EllipsoidGeometryUpdater, PolygonGeometryUpdater,
PolylineGeometryUpdater, RectangleGeometryUpdater, WallGeometryUpdater to extends GeometryUpdater
also their corresponding object to extends GeometryUpdaterStatic
* changed class MaterialProperty to trait MaterialProperty
* changed class PositionProperty to trait PositionProperty
* changed class Visualizer to trait Visualizer
* changed BillboardVisualizer,LabelVisualizer,ModelVisualizer,PathVisualizer,PointVisualizer,GeometryVisualizer
to extends Visualizer
* changed class ImageryProvider to trait ImageryProvider
* changed object ImageryProvider to trait ImageryProviderStatic
* changed ArcGisMapServerImageryProvider, SingleTileImageryProvider,BingMapsImageryProvider, UrlTemplateImageryProvider,
GoogleEarthImageryProvider,MapboxImageryProvider,WebMapTileServiceImageryProvider,WebMapServiceImageryProvider
to extends ImageryProvider, also add a corresponding object to all that extends ImageryProviderStatic
* changed class Label to trait Label
* changed class ModelAnimation to trait ModelAnimation
* changed class ModelAnimationCollection to trait ModelAnimationCollection
* changed class ModelMaterial to trait ModelMaterial
* changed class ModelMesh to trait ModelMesh
* changed class ModelNode to trait ModelNode
* changed class TileDiscardPolicy to trait TileDiscardPolicy
* changed class PointPrimitive to trait PointPrimitive
* changed class Billboard to trait Billboard
* changed class Spline to trait Spline
* changed CatmullRomSpline, LinearSpline, QuaternionSpline and HermiteSpline to extends Spline
* changed class TilingScheme to trait TilingScheme
* changed WebMercatorTilingScheme and GeographicTilingScheme to extends TilingScheme
* changed class DynamicGeometryUpdater to trait DynamicGeometryUpdater
* added rotatable2D to Viewer, Scene, CesiumWidget, ViewerOptions, SceneOptions, CesiumWidgetOptions
* added packArray and unpackArray to Cartesian2, Cartesian3, and Cartesian4 objects
* added aircraftHeadingPitchRollToFixedFrame, aircraftHeadingPitchRollQuaternion to Transforms
* renamed headingPitchRollMatrix4 to headingPitchRollToFixedFrame in Transforms
* added heightReference to PointGraphics and Model (Billboard already has it)
* added clampToGround to KMLDataSourceOptions and GeoJsonDataSourceOptions 
* added unsupportedNodeEvent to KMLDataSource in Cesium